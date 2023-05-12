package control;

import model.Usuario;

public class UsuarioDao {

    private Usuario base[];
    private int tam, i;

    public UsuarioDao(int tam) {
        this.tam = tam;
        this.i = 0;
        base = new Usuario[this.tam];
    }

    public void inserir(Usuario u) {
        base[i] = new Usuario();
        base[i] = u;
        this.i++;
        System.out.println("Cadastrado com sucesso  (EZ)");
    }

    public void listar() {
        System.out.println("Listando usuario");
        for (int l = 0; l < i; l++) {
            System.out.println(base[l].getNome());
        }
    }

}
    