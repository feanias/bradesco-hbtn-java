import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Blog {

    private List<Post> listaPostagens;

    public Blog() {
        this.listaPostagens = new ArrayList<>();
    }

    public void adicionarPostagem(Post post) {
        for (Post p : listaPostagens) {
            if (p.getTitulo().equals(post.getTitulo()) && p.getAutor().equals(post.getAutor())) {
                throw new IllegalArgumentException("Postagem jah existente");
            }
        }
        this.listaPostagens.add(post);
    }
    
    public Set<Autor> obterTodosAutores(){
        Set<Autor> listaAutores = new TreeSet<>();
        for(Post p : listaPostagens){
            listaAutores.add(p.getAutor());
        }
        return listaAutores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria(){
        Map<Categorias, Integer> mapContagem = new HashMap<>();
        for(Post p: listaPostagens){
            Categorias categoria = p.getCategoria();
            mapContagem.put(categoria, mapContagem.getOrDefault(categoria, 0) + 1);
        }
        return mapContagem;
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> postsPorAutor = new TreeSet<>();
        for (Post post : listaPostagens) {
            if (post.getAutor().equals(autor)) {
                postsPorAutor.add(post);
            }
        }
        return postsPorAutor;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria) {
        Set<Post> postsPorCategoria = new TreeSet<>();
        for (Post post : listaPostagens) {
            if (post.getCategoria() == categoria) {
                postsPorCategoria.add(post);
            }
        }
        return postsPorCategoria;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> postsPorCategoria = new TreeMap<>();
        for (Post post : listaPostagens) {
            Categorias categoria = post.getCategoria();
            postsPorCategoria.putIfAbsent(categoria, new TreeSet<>());
            postsPorCategoria.get(categoria).add(post);
        }
        return postsPorCategoria;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> postsPorAutor = new TreeMap<>();
        for (Post post : listaPostagens) {
            Autor autor = post.getAutor();
            postsPorAutor.putIfAbsent(autor, new TreeSet<>());
            postsPorAutor.get(autor).add(post);
        }
        return postsPorAutor;
    }

}
