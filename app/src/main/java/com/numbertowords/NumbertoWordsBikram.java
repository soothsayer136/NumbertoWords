package com.numbertowords;

public class NumbertoWordsBikram {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public String conversion(){
        if (number >= 0 && number <= 999){
            if(number == 0){
                return "zero";
            }else {
                String first = figureToWord(this.number/100,"Hundred");
                String second = figureToWord(this.number%100,"");
                return first+" HUNDRED "+second;
            }
        }else return "Number out of range.";
    }
    public String figureToWord(int num, String val){
        String ones[] = {"","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN","ELEVEN","TWELVE","THIRTEEN","FOURTEEN","FIFTEEN","SIXTEEN","SEVENTEEN","EIGHTEEN","NINETEEN"};
        String tens[] ={"","","TWENTY","THIRTY","FORTY","FIFTY","SIXTY","SEVENTY","EIGHTY","NINETY"};
        if (num > 19){
            return tens[num/10]+ " " + ones[num%10];
        }else return ones[num];
    }
}