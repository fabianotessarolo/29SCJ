package br.com.fiap.turma29scj.fundamentosjava.atividade3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "O Arquivo será gerado em: " + System.getProperty("java.io.tmpdir"));
		
		Exercicio5 obj = new Exercicio5();
		
		String texto = obj.codifica(JOptionPane.showInputDialog("Digite a mensagem a ser codificada: "));

		obj.saveFile(texto, "mensagemCodificada.txt");
		JOptionPane.showMessageDialog(null, "O texto codificado é: " + obj.readFile("mensagemCodificada.txt"));
		
		obj.saveFile(obj.decodifica(obj.readFile("mensagemCodificada.txt")), "mensagemDecodificada.txt");		
		JOptionPane.showMessageDialog(null, "O texto decodificado é: " + obj.readFile("mensagemDecodificada.txt"));
	}

	
	
	public String codifica(String texto) {
		StringBuilder sb = new StringBuilder().append(texto);
		for (int i = 0; i < sb.length(); i++) {
			int ascii = (int) sb.charAt(i);
			ascii++;
			sb.setCharAt(i, (char) ascii);
		}
		return sb.toString();
	}

	public String decodifica(String texto) {
		StringBuilder sb = new StringBuilder().append(texto);
		for (int i = 0; i < sb.length(); i++) {
			int ascii = (int) sb.charAt(i);
			ascii--;
			sb.setCharAt(i, (char) ascii);
		}
		return sb.toString();
	}

	public void saveFile(String texto, String filename) {

		Path p = Paths.get(System.getProperty("java.io.tmpdir") + filename);
		try {
			Files.write(p, texto.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	public String readFile(String filename) {
		Path p = Paths.get(System.getProperty("java.io.tmpdir") + filename);
		byte[] bytesArquivo = null;
		try {
			bytesArquivo = Files.readAllBytes(p);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new String(bytesArquivo);
	}

}
