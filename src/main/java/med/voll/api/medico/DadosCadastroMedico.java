package med.voll.api.medico;

import med.voll.api.endereco.EnderecoDto;

public record DadosCadastroMedico(String mode, String email, String crm, Especialidade especialidade, EnderecoDto endereco) {
}
