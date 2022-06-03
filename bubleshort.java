package model;

public class bubleshort {

    private String[] data;

    //constructor
    public bubleshort(){
    }

    public String[] getData() {return data;}

    public void setData(String[] data){
        this.data = data;
    }

    public void sortData(){
        int lenData = this.data.length;
        for(int i=0; i<lenData;i++){
            for(int j=i+1;j<lenData;j++){
                if(this.data[j].compareToIgnoreCase(this.data[i])<0){
                    String temp = this.data[j];
                    this.data[j] = this.data[j];
                    this.data[j] = temp;
                }
            }
        }
    }
    public void printData(){
        for (String datum : this.data){
            System.out.println(datum+ " ");
        }
    }

    public static void main(String[] args) {
        String[] nama = {"indrakens", "maudy", "pepsi", "alahmbuh"};
        bubleshort _mybuble = new bubleshort();
        _mybuble.setData(nama);
        _mybuble.sortData();
        _mybuble.printData();
    }
}
