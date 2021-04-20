public class Family {
    TV homeTV;
    void buyTV(TV tv){
        homeTV=tv;
    }
    void remoteControl(int m){
        homeTV.setchannel(m);
    }
    void seeTV(){
        homeTV.showProgram();
    }
}


