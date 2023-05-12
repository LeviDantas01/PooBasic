package cadastro;

import control.UsuarioDao;
import model.Endereco;
import model.Usuario;

public class Cadastro {

    public static void main(String[] args) {
        Usuario pessoa = new Usuario();
        Endereco endereco = new Endereco();
        pessoa.setIdade(19);
        pessoa.setNome("Barreto");
        pessoa.setCpf("12345678910");
        endereco.setBairro("pe de serra");
        endereco.setLogradouro("Feira de Santana");
        endereco.setCidade("Sergipe");
        endereco.setNumero(847);
        endereco.setEstado("Pernambuco");
        UsuarioDao dados = new UsuarioDao(5);
        dados.inserir(pessoa);
        dados.listar();

    }
    
}
