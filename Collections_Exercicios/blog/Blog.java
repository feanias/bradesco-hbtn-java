import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Blog {

    List<Post> listaPostagens;

    public Blog() {
        this.listaPostagens = new ArrayList<>();
    }

    public void adicionarPostagem(Post postagem){
        listaPostagens.add(postagem);
    }
    
    public Set<String> obterTodosAutores(){
        Set<String> listaAutores = new TreeSet<>();
        for(Post p : listaPostagens){
            listaAutores.add(p.getAutor());
        }
        return listaAutores;
    }

    public Map<String, Integer> obterContagemPorCategoria(){
        Map<String, Integer> mapContagem = new TreeMap<>();
        for(Post p: listaPostagens){
            String categoria = p.getCategoria();
            mapContagem.put(categoria, mapContagem.getOrDefault(categoria, 0) + 1);
        }
        return mapContagem;
    }

}
