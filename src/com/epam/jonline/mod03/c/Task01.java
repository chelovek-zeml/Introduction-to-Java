package com.epam.jonline.mod03.c;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task01 {

	/*
	 * 1. Cоздать приложение, разбирающее текст (текст хранится в строке) и
	 * позволяющее выполнять с текстом три различных операции: отсортировать абзацы
	 * по количеству предложений; в каждом предложении отсортировать слова по длине;
	 * отсортировать лексемы в предложении по убыванию количества вхождений
	 * заданного символа, а в случае равенства – по алфавиту.
	 */

	public static void main(String[] args) {

		String str = "    По крепко накатанной, обмытой теплым дождем лесной дороге бесшумно катятся дрожки. \n"
				+ "Подобрав ноги, я сижу за спиною отца.\r\n"
				+ "    В лесу тишина, после дождя сильно пахнет грибами. На ходу под ветвями деревьев я вижу \n"
				+ "красные зонтики мухоморов, бледные шляпки мокрых груздей, растущих у самой дороги. \n"
				+ "Темной стеною высится лес. Дрожки разбрызгивают воду, скопившуюся в колеях и канавах.\r\n"
				+ "    — Приехали! — говорит отец, придерживая лошадь. Первым соскакиваю с дрожек и бегу в \n"
				+ "лесную сторожку. Там светло, пахнет смолой и вынутым из печи горячим хлебом. Необыкновенно \n"
				+ "вкусным кажется мне этот черный хлеб, густо намазанный липовым медом.\r\n"
				+ "    После чая и деловых разговоров отец направляется в лес на охоту. Ах, как памятны эти \n"
				+ "первые охотничьи походы! Мы идем узкою тропой, заросшей малинником и медуницей.\r\n"
				+ "    Глухариные выводки любят такие места. Как бы оправдывая охотничьи ожидания, хлопая мощными \n"
				+ "крыльями, из-под ног срываются огромные птицы.";

		System.out.println(str);
		System.out.println(
				"-----------------------------------------------------------------------------------------------");
		System.out.println();

		List<String> paragraphList = creatParagraphList(str);
		print(paragraphList);
		System.out.println(
				"-----------------------------------------------------------------------------------------------");

		List<String> sentenceList = creatSentenceList(paragraphList);
		print(sentenceList);
		System.out.println(
				"-----------------------------------------------------------------------------------------------");
		List<String> symbolList = creatSymbolList(sentenceList);
		print(symbolList);

	}

	public static List<String> creatParagraphList(String str) {
		List<String> newParagraphList = new ArrayList<String>();

		String[] A = str.split("\r");
		int[] B = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			String s = A[i].replaceAll("[^.!?]", "");
			int n = s.length();
			B[i] = n;
		}

		Arrays.sort(B);
		for (int j = 0; j < B.length; j++) {
			for (int i = 0; i < A.length; i++) {
				String s = A[i].replaceAll("[^.!?]", "");
				int n = s.length();
				if (B[j] == n) {
					newParagraphList.add(A[i]);
					A[i] = "";
				}
			}
		}
		return newParagraphList;
	}
	
	
	

	public static List<String> creatSentenceList(List<String> paragraphList) {
		List<String> newSentenceList = new ArrayList<String>();
		String s = "";
		String t = "";

		for (int i = 0; i < paragraphList.size(); i++) {
			s = s.concat(paragraphList.get(i));
		}

		s = s.replaceAll("\\s+", " ");
		String[] C = s.split("[\\.!?]");
		for (int j = 0; j < C.length; j++) {
			C[j] = C[j].replaceAll("\\p{P}", "");
			String[] D = C[j].split(" ");

			Arrays.sort(D, new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					if (o1.length() != o2.length()) {
						return o1.length() - o2.length();
					}
					return o1.compareTo(o2);
				}
			});
			for (int k = 0; k < D.length; k++) {
				t = t.concat(" " + D[k]);
			}
			newSentenceList.add(t);
			t = "";
		}
		return newSentenceList;
	}
	
	
	
	
	public static List<String> creatSymbolList(List<String> sentenceList) {
		List<String> newsentenceList = new ArrayList<String>();
		
		for(int i = 0; i < sentenceList.size(); i++) {
			
			newsentenceList.add(sortSymbol(sentenceList.get(i)));
		}
		
		return newsentenceList;
	}
	
	
	
	
	public static String sortSymbol(String str) {
		int count = 0;
		String[] E = str.split("");
		str = str.replaceAll("(.)(?=.*\\1)", "");
		String[] F = str.split("");
		HashMap<String, Integer> map = new  HashMap<>();
		String st = "";
		
		for(int i = 0; i < F.length; i++) {
			for(int j = 0; j < E.length; j++) {
				if(F[i].equals(E[j])) {
					count = count + 1;
				}
			}
			map.put(F[i], count);
			count = 0;
		}
		List <Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				if((o1.getValue() - o2.getValue()) == 0) {
					return o1.getKey().compareTo(o2.getKey());
				}
				return o1.getValue() - o2.getValue();
			}
		});
		 
		for(int i = 0; i < list.size(); i++) {
			st = st + list.get(i).getKey();
		}
		
		return st;
	}

	
	
	
	public static void print(List<String> p) {
		for (int i = 0; i < p.size(); i++)
			System.out.println(p.get(i));
	}
}
