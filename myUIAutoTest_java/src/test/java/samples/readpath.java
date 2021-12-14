package samples;

public class readpath {

	public static void main(String[] args) {
		readpath r = new readpath();
		r.pa();

	}
	public void pa(){
//		String rootPath=this.getClass().getResource(".").getFile().toString(); 
//		System.out.println(rootPath);
		String relativelyPath=System.getProperty("user.dir")+"\\as";
		relativelyPath.replace("\\as","");
		System.out.println(relativelyPath);
	}

}
