package jConsole_Test;

import java.lang.instrument.ClassDefinition;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.lang.instrument.UnmodifiableClassException;
import java.util.ArrayList;
import java.util.jar.JarFile;

public class MainClass {
	static Instrumentation inst = new Instrumentation() {
		
		@Override
		public void setNativeMethodPrefix(ClassFileTransformer transformer,
				String prefix) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void retransformClasses(Class<?>... classes)
				throws UnmodifiableClassException {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public boolean removeTransformer(ClassFileTransformer transformer) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public void redefineClasses(ClassDefinition... definitions)
				throws ClassNotFoundException, UnmodifiableClassException {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public boolean isRetransformClassesSupported() {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean isRedefineClassesSupported() {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean isNativeMethodPrefixSupported() {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean isModifiableClass(Class<?> theClass) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public long getObjectSize(Object objectToSize) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public Class[] getInitiatedClasses(ClassLoader loader) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Class[] getAllLoadedClasses() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void appendToSystemClassLoaderSearch(JarFile jarfile) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void appendToBootstrapClassLoaderSearch(JarFile jarfile) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void addTransformer(ClassFileTransformer transformer,
				boolean canRetransform) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void addTransformer(ClassFileTransformer transformer) {
			// TODO Auto-generated method stub
			
		}
	};
	static ArrayList <MainClass> arr = new ArrayList<MainClass> (){{
		add(new MainClass());
	}};
	static ArrayList <MainClass> arr1 = new ArrayList<MainClass> (){{
		for (int i=0; i<100; i++){
		add(new MainClass());
		}
	}};

	public static void main(String[] args) {
//		while (true){
//			System.out.println(1);
//			arr.add(new MainClass());
//		}
		
		System.out.println(inst.getObjectSize(arr));
		System.out.println(inst.getObjectSize(arr1));
	}

}
