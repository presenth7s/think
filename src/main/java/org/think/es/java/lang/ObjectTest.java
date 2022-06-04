package org.think.es.java.lang;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * public class ObjectTestDump implements Opcodes {
 *
 *     public static byte[] dump() throws Exception {
 *
 *         ClassWriter classWriter = new ClassWriter(0);
 *         FieldVisitor fieldVisitor;
 *         RecordComponentVisitor recordComponentVisitor;
 *         MethodVisitor methodVisitor;
 *         AnnotationVisitor annotationVisitor0;
 *
 *         classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/think/es/java/lang/ObjectTest", null, "org/think/es/java/lang/BooleanTest", new String[]{"java/io/Serializable"});
 *
 *         classWriter.visitSource("ObjectTest.java", null);
 *
 *         {
 *             fieldVisitor = classWriter.visitField(ACC_PRIVATE, "v1", "B", null, null);
 *             fieldVisitor.visitEnd();
 *         }
 *         {
 *             fieldVisitor = classWriter.visitField(ACC_PRIVATE, "v2", "C", null, null);
 *             fieldVisitor.visitEnd();
 *         }
 *         {
 *             fieldVisitor = classWriter.visitField(ACC_PRIVATE, "v3", "S", null, null);
 *             fieldVisitor.visitEnd();
 *         }
 *         {
 *             fieldVisitor = classWriter.visitField(ACC_PRIVATE, "v4", "I", null, null);
 *             fieldVisitor.visitEnd();
 *         }
 *         {
 *             fieldVisitor = classWriter.visitField(ACC_PRIVATE, "v5", "J", null, null);
 *             fieldVisitor.visitEnd();
 *         }
 *         {
 *             fieldVisitor = classWriter.visitField(ACC_PRIVATE, "v6", "F", null, null);
 *             fieldVisitor.visitEnd();
 *         }
 *         {
 *             fieldVisitor = classWriter.visitField(ACC_PRIVATE, "v7", "D", null, null);
 *             fieldVisitor.visitEnd();
 *         }
 *         {
 *             fieldVisitor = classWriter.visitField(ACC_PRIVATE, "v8", "[I", null, null);
 *             fieldVisitor.visitEnd();
 *         }
 *         {
 *             fieldVisitor = classWriter.visitField(ACC_PRIVATE, "v9", "Ljava/lang/String;", null, null);
 *             fieldVisitor.visitEnd();
 *         }
 *         {
 *             fieldVisitor = classWriter.visitField(ACC_PRIVATE, "v10", "[Ljava/lang/String;", null, null);
 *             fieldVisitor.visitEnd();
 *         }
 *         {
 *             fieldVisitor = classWriter.visitField(ACC_PRIVATE, "v11", "[[I", null, null);
 *             fieldVisitor.visitEnd();
 *         }
 *         {
 *             fieldVisitor = classWriter.visitField(ACC_PRIVATE, "v12", "Ljava/lang/Object;", null, null);
 *             fieldVisitor.visitEnd();
 *         }
 *         {
 *             fieldVisitor = classWriter.visitField(ACC_PRIVATE, "v13", "Ljava/util/List;", "Ljava/util/List<*>;", null);
 *             fieldVisitor.visitEnd();
 *         }
 *         {
 *             fieldVisitor = classWriter.visitField(ACC_PRIVATE, "map", "Ljava/util/Map;", "Ljava/util/Map<**>;", null);
 *             fieldVisitor.visitEnd();
 *         }
 *         {
 *             methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
 *             methodVisitor.visitCode();
 *             Label label0 = new Label();
 *             methodVisitor.visitLabel(label0);
 *             methodVisitor.visitLineNumber(7, label0);
 *             methodVisitor.visitVarInsn(ALOAD, 0);
 *             methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/think/es/java/lang/BooleanTest", "<init>", "()V", false);
 *             methodVisitor.visitInsn(RETURN);
 *             Label label1 = new Label();
 *             methodVisitor.visitLabel(label1);
 *             methodVisitor.visitLocalVariable("this", "Lorg/think/es/java/lang/ObjectTest;", null, label0, label1, 0);
 *             methodVisitor.visitMaxs(1, 1);
 *             methodVisitor.visitEnd();
 *         }
 *         {
 *             methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "main", "([Ljava/lang/String;)V", null, null);
 *             methodVisitor.visitCode();
 *             Label label0 = new Label();
 *             methodVisitor.visitLabel(label0);
 *             methodVisitor.visitLineNumber(25, label0);
 *             methodVisitor.visitLdcInsn(Type.getType("Lorg/think/es/java/lang/BooleanTest;"));
 *             methodVisitor.visitVarInsn(ASTORE, 1);
 *             Label label1 = new Label();
 *             methodVisitor.visitLabel(label1);
 *             methodVisitor.visitLineNumber(27, label1);
 *             methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
 *             methodVisitor.visitVarInsn(ALOAD, 1);
 *             methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/Object;)V", false);
 *             Label label2 = new Label();
 *             methodVisitor.visitLabel(label2);
 *             methodVisitor.visitLineNumber(28, label2);
 *             methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
 *             methodVisitor.visitVarInsn(ALOAD, 1);
 *             methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getClassLoader", "()Ljava/lang/ClassLoader;", false);
 *             methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/Object;)V", false);
 *             Label label3 = new Label();
 *             methodVisitor.visitLabel(label3);
 *             methodVisitor.visitLineNumber(29, label3);
 *             methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
 *             methodVisitor.visitVarInsn(ALOAD, 1);
 *             methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getClassLoader", "()Ljava/lang/ClassLoader;", false);
 *             methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ClassLoader", "getParent", "()Ljava/lang/ClassLoader;", false);
 *             methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/Object;)V", false);
 *             Label label4 = new Label();
 *             methodVisitor.visitLabel(label4);
 *             methodVisitor.visitLineNumber(30, label4);
 *             methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
 *             methodVisitor.visitVarInsn(ALOAD, 1);
 *             methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getClassLoader", "()Ljava/lang/ClassLoader;", false);
 *             methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ClassLoader", "getParent", "()Ljava/lang/ClassLoader;", false);
 *             methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ClassLoader", "getParent", "()Ljava/lang/ClassLoader;", false);
 *             methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/Object;)V", false);
 *             Label label5 = new Label();
 *             methodVisitor.visitLabel(label5);
 *             methodVisitor.visitLineNumber(31, label5);
 *             methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
 *             methodVisitor.visitVarInsn(ALOAD, 1);
 *             methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
 *             methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
 *             Label label6 = new Label();
 *             methodVisitor.visitLabel(label6);
 *             methodVisitor.visitLineNumber(32, label6);
 *             methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
 *             methodVisitor.visitVarInsn(ALOAD, 1);
 *             methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getPackage", "()Ljava/lang/Package;", false);
 *             methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Package", "getName", "()Ljava/lang/String;", false);
 *             methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
 *             Label label7 = new Label();
 *             methodVisitor.visitLabel(label7);
 *             methodVisitor.visitLineNumber(33, label7);
 *             methodVisitor.visitInsn(RETURN);
 *             Label label8 = new Label();
 *             methodVisitor.visitLabel(label8);
 *             methodVisitor.visitLocalVariable("args", "[Ljava/lang/String;", null, label0, label8, 0);
 *             methodVisitor.visitLocalVariable("clz", "Ljava/lang/Class;", "Ljava/lang/Class<+Lorg/think/es/java/lang/BooleanTest;>;", label1, label8, 1);
 *             methodVisitor.visitMaxs(2, 2);
 *             methodVisitor.visitEnd();
 *         }
 *         {
 *             methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "test0", "(IJ)J", null, null);
 *             methodVisitor.visitCode();
 *             Label label0 = new Label();
 *             methodVisitor.visitLabel(label0);
 *             methodVisitor.visitLineNumber(36, label0);
 *             methodVisitor.visitInsn(LCONST_0);
 *             methodVisitor.visitInsn(LRETURN);
 *             Label label1 = new Label();
 *             methodVisitor.visitLabel(label1);
 *             methodVisitor.visitLocalVariable("this", "Lorg/think/es/java/lang/ObjectTest;", null, label0, label1, 0);
 *             methodVisitor.visitLocalVariable("p1", "I", null, label0, label1, 1);
 *             methodVisitor.visitLocalVariable("p2", "J", null, label0, label1, 2);
 *             methodVisitor.visitMaxs(2, 4);
 *             methodVisitor.visitEnd();
 *         }
 *         {
 *             methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "test1", "(ILjava/lang/Long;)Ljava/lang/Long;", null, null);
 *             methodVisitor.visitCode();
 *             Label label0 = new Label();
 *             methodVisitor.visitLabel(label0);
 *             methodVisitor.visitLineNumber(40, label0);
 *             methodVisitor.visitInsn(LCONST_0);
 *             methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
 *             methodVisitor.visitInsn(ARETURN);
 *             Label label1 = new Label();
 *             methodVisitor.visitLabel(label1);
 *             methodVisitor.visitLocalVariable("this", "Lorg/think/es/java/lang/ObjectTest;", null, label0, label1, 0);
 *             methodVisitor.visitLocalVariable("p1", "I", null, label0, label1, 1);
 *             methodVisitor.visitLocalVariable("p2", "Ljava/lang/Long;", null, label0, label1, 2);
 *             methodVisitor.visitMaxs(2, 3);
 *             methodVisitor.visitEnd();
 *         }
 *         classWriter.visitEnd();
 *
 *         return classWriter.toByteArray();
 *     }
 * }
 */
public class ObjectTest extends BooleanTest implements Serializable {

    private byte     v1;
    private char     v2;
    private short    v3;
    private int      v4;
    private long     v5;
    private float    v6;
    private double   v7;
    private int[]    v8;
    private String   v9;
    private String[] v10;
    private int[][]  v11;
    private Object   v12;
    private List<?> v13;
    private Map<?, ?> map;

    public static void main(String[] args) {
        Class<? extends BooleanTest> clz = BooleanTest.class;

        System.out.println(clz);
        System.out.println(clz.getClassLoader());
        System.out.println(clz.getClassLoader().getParent());
        System.out.println(clz.getClassLoader().getParent().getParent());
        System.out.println(clz.getName());
        System.out.println(clz.getPackage().getName());

        System.out.println(test0(1, 2));
    }

    public static long test0(int p1, long p2) {
        {
            p2 = (long) p1 << 2;
        }
        return p2;
    }

    public Long test1(int p1, Long p2) {
        return 0L;
    }
}
