import javassist.*;
public class Main {
    public static void main(String[] args) throws Exception{
        ClassPool pool=ClassPool.getDefault();
        pool.insertClassPath("./charles.jar");
        CtClass ctClass = pool.get("com.xk72.charles.kKPk");
        CtMethod ctMethod =ctClass.getDeclaredMethod("lcJx",null);
        ctMethod.setBody("{return true;}");
        ctMethod = ctClass.getDeclaredMethod("JZlU",null);
        ctMethod.setBody("{return \" H1d3r\";}");
        ctClass.writeFile();
    }
}
