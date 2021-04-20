public class Land {
    public static void main(String args[]){
        Village.setWaterAmount(200);
        int leftWater=Village.waterAmount;
        System.out.println("水井中有"+leftWater+"升水");
        Village zhaozhuang,majiahezi;
        zhaozhuang=new Village("赵庄");
        majiahezi=new Village("马家河子");
        zhaozhuang.setPeopleNumber(80);
        majiahezi.setPeopleNumber(120);
        zhaozhuang.drinkWater(50);
        leftWater=majiahezi.lookWaterAmount();
        String name=majiahezi.name;
        System.out.print(name+"发现水井中有"+leftWater+"升水");
        majiahezi.drinkWater(100);
        leftWater=zhaozhuang.lookWaterAmount();
        name=zhaozhuang.name;
        System.out.println(name+"发现井水中有"+leftWater+"升水");
        int peopleNumber=zhaozhuang.getPeopleNumber();
        System.out.println("赵庄的人口:"+peopleNumber);
        peopleNumber=majiahezi.getPeopleNumber();
        System.out.println("马家河子的人口:"+peopleNumber);
    }
}

