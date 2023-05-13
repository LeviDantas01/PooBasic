package control;

import model.Usuario;

public class UsuarioDao {

    private Usuario base[];
    private int tam;
    private int  i = 0;

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

    public void alterar(Usuario u) {

        int ln;
        for(ln = 0; ln < this.i; ln++) {
            if(base[ln].getCpf().equals(u.getCpf()))
            base[ln] = u;
        }

        System.out.println("Alterado com sucesso");

    }

    public void listar() {
        System.out.println("Listando usuario");
        for (int l = 0; l < i; l++) {
            System.out.println(base[l].getNome());
        }
    }

}
    