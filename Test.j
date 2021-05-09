.source Test.j
.class  public Test
.super  java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static main([Ljava/lang/String;)V

    ldc 3

; --- cheguei aqui --- 

; types size: 1

; symbols size: 1
    istore 1

    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 1
    ldc 5
    imul
    invokevirtual java/io/PrintStream/print(I)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V
    iload 1
    ldc 2
    idiv

; --- cheguei aqui --- 

; types size: 2

; symbols size: 2
    istore 2

    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc 4
    iload 1
    ldc 3
    iload 2
    isub
    imul
    iadd
    invokevirtual java/io/PrintStream/print(I)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V
    ldc 6

; --- cheguei aqui --- 

; types size: 3

; symbols size: 3
    istore 1

    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 1
    invokevirtual java/io/PrintStream/print(I)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/print(I)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V
    ldc 88

; --- cheguei aqui --- 

; types size: 3

; symbols size: 3
    istore 3

    return
.limit stack 10
.limit locals 4
.end method
