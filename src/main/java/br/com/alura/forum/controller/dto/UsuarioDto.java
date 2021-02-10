package br.com.alura.forum.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.forum.modelo.Usuario;

public class UsuarioDto {
	private Long matricula;
	private String nome;
	
	
	public UsuarioDto(Usuario usuario) {
		this.matricula = usuario.getId();
		this.nome = usuario.getNome();
	}


	public Long getMatricula() {
		return matricula;
	}


	public String getNome() {
		return nome;
	}
	
	public static List<UsuarioDto> converter(List<Usuario> usuarios){
		return usuarios.stream().map(UsuarioDto::new).collect(Collectors.toList());
	}
}
