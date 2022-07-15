package com.ll.exam;

public class ArrayList {

    int lastIndex;
    int [] arr;
    public ArrayList(){
        this.lastIndex = 0;
        arr = new int[2];
    }
    public int size() {
        return this.lastIndex;
    }

    public void add(int value) {

        if(lastIndex + 1 >= arr.length) {
            int [] temp = arr.clone();
            arr = new int[lastIndex * 2];
            for(int i = 0; i < lastIndex; i++){
                arr[i] = temp[i];
            }

        }
        arr[lastIndex++] = value;
    }

    public void addAt(int value, int index) {

        if(lastIndex + 1 >= arr.length) {
            int [] temp = arr.clone();
            arr = new int[lastIndex * 2];
            for(int i = 0; i < lastIndex; i++){
                arr[i] = temp[i];
            }
        }

        for(int i = lastIndex-1; i > index-1; i--){
            arr[i  + 1] = arr[i];
        }
        arr[index] = value;
        lastIndex++;
    }

    public int get(int i) {
        return arr[i];
    }

    public void removeAt(int removeIndex) {

        for(int i = removeIndex; i < lastIndex; i++){
            arr[i] = arr[i + 1];
        }
        lastIndex--;
    }

    public int getArrayLength() {
        return arr.length;
    }

    public void showAllValues() {
        System.out.println("== 전체 데이터 출력 ==");

        for(int i = 0; i < lastIndex; i++){
            System.out.println(i+" : " + arr[i]);
        }
    }
}
