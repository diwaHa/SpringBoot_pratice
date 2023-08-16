package com.in28minutes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class QuickSortAlgorithm implements SortAlgorithm {

	@Override
	public int[] sort(int[] number) {

		return number;
	}

}
