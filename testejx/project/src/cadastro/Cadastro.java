package cadastro;

import control.UsuarioDao;
import model.Endereco;
import model.Usuario;

public class Cadastro {

    public static void main(String[] args) {

        Usuario pessoa = new Usuario();
        Endereco endereco = new Endereco();
        UsuarioDao dados = new UsuarioDao(5);

        pessoa.setIdade(19);
        pessoa.setNome("Barreto");
        pessoa.setCpf("12345678910");
        endereco.setBairro("pe de serra");
        endereco.setLogradouro("Feira de Santana");
        endereco.setCidade("Sergipe");
        endereco.setNumero(847);
        endereco.setEstado("Pernambuco");

        dados.inserir(pessoa);

        pessoa = new Usuario();
        pessoa.setIdade(19);
        pessoa.setNome("Levi");
        pessoa.setCpf("12345678910");
        endereco.setBairro("pe de serra");
        endereco.setLogradouro("Feira de Santana");
        endereco.setCidade("Sergipe");
        endereco.setNumero(847);
        endereco.setEstado("Pernambuco");
        dados.inserir(pessoa);
        dados.excluir(pessoa.getCpf());
        //dados.listar();

    }

}
