.source Test.j
.class  public Test
.super  java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static main([Ljava/lang/String;)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "Compilador Flip Flop"
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "---"
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "- Operações matemáticas"
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V
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
    ldc "---"
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "- IF"
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V
    ldc 1

; --- cheguei aqui --- 

; types size: 3

; symbols size: 3
    istore 1

    ldc 2

; --- cheguei aqui --- 

; types size: 3

; symbols size: 3
    istore 2

    iload 1
    iload 2
    if_icmpne NOT_IF_0
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "igual"
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V
    NOT_IF_0:
    iload 1
    iload 2
    if_icmpeq NOT_IF_1
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "diferente"
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V
    NOT_IF_1:
    ldc 2

; --- cheguei aqui --- 

; types size: 3

; symbols size: 3
    istore 1

    iload 1
    iload 2
    if_icmpge NOT_IF_2
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "menor"
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V
    NOT_IF_2:
    iload 1
    iload 2
    if_icmpgt NOT_IF_3
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "menor igual"
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V
    NOT_IF_3:
    ldc 1

; --- cheguei aqui --- 

; types size: 3

; symbols size: 3
    istore 2

    iload 1
    iload 2
    if_icmple NOT_IF_4
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "maior"
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V
    NOT_IF_4:
    iload 1
    iload 2
    if_icmplt NOT_IF_5
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "maior igual"
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V
    NOT_IF_5:
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc ""
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V
    ldc 1

; --- cheguei aqui --- 

; types size: 3

; symbols size: 3
    istore 1

    ldc 2

; --- cheguei aqui --- 

; types size: 3

; symbols size: 3
    istore 2

    ldc 3

; --- cheguei aqui --- 

; types size: 3

; symbols size: 3
    istore 3

    iload 1
    iload 2
    if_icmpeq NOT_IF_6
    iload 1
    iload 2
    if_icmpge NOT_IF_7
    iload 2
    iload 3
    if_icmple NOT_IF_8
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc 1
    invokevirtual java/io/PrintStream/print(I)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V
    NOT_IF_8:
    iload 2
    iload 3
    if_icmpgt NOT_IF_9
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc 2
    invokevirtual java/io/PrintStream/print(I)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V
    NOT_IF_9:
    NOT_IF_7:
    iload 1
    iload 2
    if_icmplt NOT_IF_10
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc 3
    invokevirtual java/io/PrintStream/print(I)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V
    NOT_IF_10:
    NOT_IF_6:
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "---"
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "- WHILE"
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V
    ldc 0

; --- cheguei aqui --- 

; types size: 4

; symbols size: 4
    istore 1

    BEGIN_WHILE_0:
    iload 1
    ldc 5
    if_icmpgt END_WHILE_0
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "x é "
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 1
    invokevirtual java/io/PrintStream/print(I)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V
    iload 1
    ldc 1
    iadd

; --- cheguei aqui --- 

; types size: 4

; symbols size: 4
    istore 1

    goto BEGIN_WHILE_0
    END_WHILE_0:
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc ""
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V
    ldc 10

; --- cheguei aqui --- 

; types size: 4

; symbols size: 4
    istore 1

    BEGIN_WHILE_1:
    iload 1
    ldc 3
    if_icmple END_WHILE_1
    iload 1
    ldc 8
    if_icmpne NOT_IF_11
    iload 1
    ldc 1
    isub

; --- cheguei aqui --- 

; types size: 4

; symbols size: 4
    istore 1

    goto BEGIN_WHILE_1
    NOT_IF_11:
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "x é "
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 1
    invokevirtual java/io/PrintStream/print(I)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V
    iload 1
    ldc 1
    isub

; --- cheguei aqui --- 

; types size: 4

; symbols size: 4
    istore 1

    goto BEGIN_WHILE_1
    END_WHILE_1:
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "---"
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V
    return
.limit stack 10
.limit locals 4
.end method

; symbols: [args, x, y, z]
