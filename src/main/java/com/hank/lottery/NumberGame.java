package com.hank.lottery;

import java.util.HashSet;
import java.util.Set;

//樂透練習
public abstract class NumberGame {
        Set<Integer> numbers = new HashSet<>();
        int numberCount = 0;
        public abstract void generate(); //不給繼承，副著別人自已寫，在 ()後面加上分號
        public boolean validate(){
                if (numbers.size() == numberCount) //沒寫 if (){} else {}，是因為指令只有一行 return
                        return true;
                 else
                        return  false;
        }
}