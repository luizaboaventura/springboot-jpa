package med.voll.api.paciente;

import jakarta.validation.constraints.NotNull;

public record DadosListagemPaciente(@NotNull Long id, String nome, String email, String cpf) {
	
    public DadosListagemPaciente(Paciente paciente) {
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getCpf());
    }
}
