package org.think.es.java.lang;

/**
 * public class BooleanTestDump implements Opcodes {
 *
 *     public static byte[] dump() throws Exception {
 *
 *         ClassWriter classWriter = new ClassWriter(0);
 *         FieldVisitor fieldVisitor;
 *         RecordComponentVisitor recordComponentVisitor;
 *         MethodVisitor methodVisitor;
 *         AnnotationVisitor annotationVisitor0;
 *
 *         classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/think/es/java/lang/BooleanTest", null, "java/lang/Object", null);
 *
 *         classWriter.visitSource("BooleanTest.java", null);
 *
 *         {
 *             methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
 *             methodVisitor.visitCode();
 *             Label label0 = new Label();
 *             methodVisitor.visitLabel(label0);
 *             methodVisitor.visitLineNumber(3, label0);
 *             methodVisitor.visitVarInsn(ALOAD, 0);
 *             methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
 *             methodVisitor.visitInsn(RETURN);
 *             Label label1 = new Label();
 *             methodVisitor.visitLabel(label1);
 *             methodVisitor.visitLocalVariable("this", "Lorg/think/es/java/lang/BooleanTest;", null, label0, label1, 0);
 *             methodVisitor.visitMaxs(1, 1);
 *             methodVisitor.visitEnd();
 *         }
 *         {
 *             methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "main", "([Ljava/lang/String;)V", null, null);
 *             methodVisitor.visitCode();
 *             Label label0 = new Label();
 *             methodVisitor.visitLabel(label0);
 *             methodVisitor.visitLineNumber(6, label0);
 *             methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
 *             methodVisitor.visitLdcInsn("true");
 *             methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "getBoolean", "(Ljava/lang/String;)Z", false);
 *             methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Z)V", false);
 *             Label label1 = new Label();
 *             methodVisitor.visitLabel(label1);
 *             methodVisitor.visitLineNumber(7, label1);
 *             methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
 *             methodVisitor.visitLdcInsn("True");
 *             methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "parseBoolean", "(Ljava/lang/String;)Z", false);
 *             methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Z)V", false);
 *             Label label2 = new Label();
 *             methodVisitor.visitLabel(label2);
 *             methodVisitor.visitLineNumber(8, label2);
 *             methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
 *             methodVisitor.visitInsn(ICONST_1);
 *             methodVisitor.visitInsn(ICONST_0);
 *             methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "compare", "(ZZ)I", false);
 *             methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(I)V", false);
 *             Label label3 = new Label();
 *             methodVisitor.visitLabel(label3);
 *             methodVisitor.visitLineNumber(9, label3);
 *             methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
 *             methodVisitor.visitInsn(ICONST_1);
 *             methodVisitor.visitInsn(ICONST_0);
 *             methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "logicalAnd", "(ZZ)Z", false);
 *             methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Z)V", false);
 *             Label label4 = new Label();
 *             methodVisitor.visitLabel(label4);
 *             methodVisitor.visitLineNumber(10, label4);
 *             methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
 *             methodVisitor.visitInsn(ICONST_1);
 *             methodVisitor.visitInsn(ICONST_0);
 *             methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "logicalOr", "(ZZ)Z", false);
 *             methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Z)V", false);
 *             Label label5 = new Label();
 *             methodVisitor.visitLabel(label5);
 *             methodVisitor.visitLineNumber(11, label5);
 *             methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
 *             methodVisitor.visitInsn(ICONST_1);
 *             methodVisitor.visitInsn(ICONST_0);
 *             methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "logicalXor", "(ZZ)Z", false);
 *             methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Z)V", false);
 *             Label label6 = new Label();
 *             methodVisitor.visitLabel(label6);
 *             methodVisitor.visitLineNumber(12, label6);
 *             methodVisitor.visitInsn(RETURN);
 *             Label label7 = new Label();
 *             methodVisitor.visitLabel(label7);
 *             methodVisitor.visitLocalVariable("args", "[Ljava/lang/String;", null, label0, label7, 0);
 *             methodVisitor.visitMaxs(3, 1);
 *             methodVisitor.visitEnd();
 *         }
 *         classWriter.visitEnd();
 *
 *         return classWriter.toByteArray();
 *     }
 * }
 */
public class BooleanTest {

    public static void main(String[] args) {
        System.out.println(Boolean.getBoolean("true"));
        System.out.println(Boolean.parseBoolean("True"));
        System.out.println(Boolean.compare(true, false));
        System.out.println(Boolean.logicalAnd(true, false));
        System.out.println(Boolean.logicalOr(true, false));
        System.out.println(Boolean.logicalXor(true, false));
    }
}
