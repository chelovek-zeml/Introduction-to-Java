package com.epam.jonline.mod04.a05;

public class Counter {

	private int min;
	private int max;
	private int condition;

	public Counter (int min_, int max_, int condition_) { //Счетчик с произвольным текущим значением.
		min = min_;
		max = max_;
		condition = condition_;
		
		if(max < min) {                         // Проверка, чтобы значение min действительно было меньше значения max.
			int t = max;
			max = min;
			min = t;
		}
		
		if(condition < min)                     // Проверка, чтобы при произвольном вводе текущего значения счетчика, значение не выходило 
			condition = min;                    // за пределы min и max.
		if(condition > max)
			condition = max;
	}

	public Counter (int min_, int max_) {          //Счетчик по умолчанию. Изначально текущее значение всегда будет равно минимальному.
		this(min_, max_, min_);
		condition = min;
	}
	
	public void inc() {                            //Увеличение текущего значения счетчика.
		condition++;
		if(condition > max)
			condition = min;
	}
	
	public void dec() {                           //Уменьшение текущего значения счетчика.
		condition--;
		if(condition < min)
			condition = max;
	}
	
	public int getCondition() {
		return condition;
	}
}
