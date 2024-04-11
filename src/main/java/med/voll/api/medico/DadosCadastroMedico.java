package med.voll.api.medico;

import med.voll.api.endereco.Endereco;

public record DadosCadastroMedico(String mode, String email, String crm, Especialidade especialidade, Endereco endereco) {
}
