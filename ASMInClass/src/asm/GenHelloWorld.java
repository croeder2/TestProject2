package asm;

import util.Utilities.*;
import org.objectweb.asm.*;

public class GenHelloWorld {
	
	public static void main(String[]args) {
		
		ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES); //classwriter object, creating class file
		cw.visit(Opcodes.V11, Opcodes.ACC_PUBLIC, "HelloWorld", null, "java/lang/Object", null); //sets up public class helloworld, inherits from object, helloworld = name of class, v11 = version 11
		
		
		//Constructor
		{
			MethodVisitor mv=cw.visitMethod(Opcodes.ACC_PUBLIC, "<init", "()", null, null); //generates constructor, etc
			mv.visitEnd();
		}
		
		
		//Bytecode
		{
			MethodVisitor mv = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, "main", "([Ljava])"; //generates bytecode
			mv.visitCode();
			mv.visitFieldInsn(Opcodes.GETSTATIC), "java/lang/System", "out", "Ljava/io/PrintStream";
			mv.visit
			
		}
		
		
		
		cw.visitEnd(); //end main method generation
		
		byte[] b = cw.toByteArray();
		
		writeFile(b, "HelloWorld.class");
		
		System.out.println("Done!");
		
		
	}//end main
		
}
