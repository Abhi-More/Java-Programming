// package Inheritance;

//Hybrid

class MET{
    String location = " ADGAON";
}


//MET->IOE
class IOE extends MET{
    
}


//MET->IOT
class IOT extends MET{

}

//MET->IOP
class IOP extends MET{

}

//MET->IOE->Comp
class Comp extends IOE{
    void showDept(){
        System.out.println("MET->IOE->Computer Department" + location);
    }
}

//MET->IOE->Comp->SE
class SE extends Comp{
    void showYear(){
        System.out.println("MET->IOE->Computer Department->SE");
    }
}

//MET->IOT->CDAC
class CDAC extends IOT{
    void showDept(){
        System.out.println("MET->IOT->C-DAC" + location);
    }
}

public class HybridInheritance {
    public static void main(String[] args)
    {
        Comp myDept = new Comp();
        myDept.showDept();

        SE myYear = new SE();
        myYear.showDept();
        myYear.showYear();

        CDAC cdac = new CDAC();
        cdac.showDept();
    }
}
