package med.voll.api.paciente;

import med.voll.api.endereco.EnderecoDto;

public record DadosCadastroPaciente(String nome, String email, String telefone, String cpf, EnderecoDto endereco ) {
}
