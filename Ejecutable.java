package Logger;

public class Ejecutable {

	public static void main(String[] args) {
		LogError LE = new LogError();
		System.out.println(LE.printError("Ocurrio un error en LogError"));
		
		LogWarm LW = new LogWarm();
		System.out.println(LW.printError("Ocurrio un error en LogWarm"));
		System.out.println(LW.printWarm("Ocurrio un warning en LogWarm"));
		
		
		LogInfo LI = new LogInfo();
		System.out.println(LI.printError("Ocurrio un error en LogInfo"));
		System.out.println(LI.printWarm("Ocurrio un warning en LogInfo"));
		System.out.println(LI.printInfo("Ocurrio un Info en LogInfo"));
		

	}

}
