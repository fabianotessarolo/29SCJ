package br.com.fiap.turma29scj.fundamentosjava.atividade4;

import java.util.Collections;
import java.util.Stack;
import java.util.concurrent.TimeUnit;

public class ShowMessage implements Runnable {
	
	public Stack<String> createMessages(){
		Stack<String> messages = new Stack<>();
		messages.push("Viva o hoje, pois o ontem já se foi, e o amanhã talvez não venha.");
		messages.push("Se você encontrar um caminho sem obstáculos, ele provavelmente não leva a lugar nenhum.");
		messages.push("Cada cicatriz que temos é a confirmação de que uma ferida sara. Cicatrizes são marcas de superação que só um verdadeiro guerreiro possui.");
		messages.push("Aprendi que amar não significa estar junto, mas sim querer ver a pessoa feliz, mesmo que isso custe a sua felicidade. ");
		messages.push("O tempo deixa perguntas, mostra respostas, esclarece dúvidas, mas, acima de tudo, o tempo traz verdades.");
		messages.push("Ninguém faz cadeados, sem chaves. Do mesmo modo, Deus não te dá problemas, sem soluções.");
		messages.push("Duvide do que vem fácil. E não desista do que é difícil.");
		messages.push("Cuidado com as voltas que o mundo dá. Hoje você lança as palavras, amanhã sente o efeito delas.");
		messages.push("Honestidade é um presente muito caro. Não espere isso de pessoas baratas. ");
		Collections.shuffle(messages);
		return messages;
	}

	@Override
	public void run() {
		Stack<String> messages = createMessages();
			while(!messages.isEmpty()) {
				System.out.println(messages.pop());
				try {
					TimeUnit.SECONDS.sleep(20);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}			
			}	
	}
}
