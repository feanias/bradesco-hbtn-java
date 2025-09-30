import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ConsultaPessoas {
    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> pessoas) {
        return pessoas.stream()
        .collect(Collectors.groupingBy(Pessoa::getCargo,
            () -> new TreeMap<String, TreeSet<Pessoa>>(Collections.reverseOrder()),
            Collectors.toCollection(TreeSet::new))
            );
    }

    public static TreeMap<String, Long> obterContagemPessoasPorCargo(List<Pessoa> listaPessoas) {
        return listaPessoas.stream().collect(Collectors.groupingBy(
            Pessoa::getCargo,
            () -> new TreeMap<>(obterComparatorCargo()),
            Collectors.counting()
        ));
    }

    private static Comparator<String> obterComparatorCargo() {
        List<String> ordem = Arrays.asList("Product Owner", "Analista QA", "Desenvolvedor");

        return Comparator
            .comparingInt((String s) -> {
                int idx = ordem.indexOf(s);
                return idx == -1 ? Integer.MAX_VALUE : idx;
            })
            .thenComparing(Comparator.naturalOrder());
    }
}