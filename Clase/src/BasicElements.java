public class BasicElements {

    public static void main(String[] args){
        //Ejercicio 1
        System.out.println("********");
        System.out.println("Ejercicio 1");
        System.out.println("********");
        //Solución
        System.out.println("El identificador: \"2Nivel\" no es valido en Java");

        //Ejercicio 2
        System.out.println("********");
        System.out.println("Ejercicio 2");
        System.out.println("********");
        //Solución
        double z =5.5, y = 0.23;
        y = y +(int)z;
        System.out.println("El valor de y es: " + y);

        //Ejercicio 3
        System.out.println("********");
        System.out.println("Ejercicio 3");
        System.out.println("********");
        //Solución
        System.out.println("Para guardar el valor 1.618034 se necesita una variable de tipo double");

        //Ejercicio 4
        System.out.println("********");
        System.out.println("Ejercicio 4");
        System.out.println("********");
        //Solución
        System.out.println("Para guardar si cierto valor entero es primo o no se necesita un tipo boolean");

        //Ejercicio 5
        System.out.println("********");
        System.out.println("Ejercicio 5");
        System.out.println("********");
        //Solución
        int x;
        y = 232.675;
        x = (int)(y + 0.5);
        System.out.println("El valor de x es: " + x);

        //Ejercicio 6
        System.out.println("********");
        System.out.println("Ejercicio 6");
        System.out.println("********");
        //Solución
        x = 0;
        y = 232.675;
        x = (int)(y - 0.9);
        System.out.println("El valor de x es: " + x);

        //Ejercicio 7
        System.out.println("********");
        System.out.println("Ejercicio 7");
        System.out.println("********");
        //Solución
        x = 0;
        y = 1243.5321;
        x =(short)(y - 0.9);
        System.out.println("El valor de x es: " + x);

        //Ejercicio 8
        System.out.println("********");
        System.out.println("Ejercicio 8");
        System.out.println("********");
        //Solución
        System.out.println("No se puede hacer la asignación x=y cuando x es int e y es boolean");

        //Ejercicio 9
        System.out.println("********");
        System.out.println("Ejercicio 9");
        System.out.println("********");
        //Solución
        int var1 = 15;
        {
            int var2 = 30;
        }
        System.out.println("var1= " + var1);
        System.out.println("var2= " + "No se puede acceder a var2 porque esta dentro de otro bloque, solo se puede acceder a vars del mismo bloque en cuestion");


        //Ejercicio 10
        System.out.println("********");
        System.out.println("Ejercicio 10");
        System.out.println("********");
        //Solución
        char total = 'A', num = 'C';
        total = ++num;
        num = total++;
        System.out.println("El valor de total es: " + total);
        System.out.println("El valor de num es: " + num);


        //Ejercicio 11
        System.out.println("********");
        System.out.println("Ejercicio 11");
        System.out.println("********");
        //Solución
        int total1 = 2, num1 = 3;
        total1 = ++num1;
        System.out.println("El valor de total1 es: " + total1);
        System.out.println("El valor de num1 es: " + num1);

        //Ejercicio 12
        System.out.println("********");
        System.out.println("Ejercicio 12");
        System.out.println("********");
        //Solución
        x = 1;
        boolean r1, r2, r3, r4;
        r1 = (x > 1) && (x++ < 10);
        r2 = (10 < x) && (15 > x++);
        r3 = (10 == x) || (20 > x++);
        r4 = (10 == x) || (20 > x++);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);

        //Ejercicio 13
        System.out.println("********");
        System.out.println("Ejercicio 13");
        System.out.println("********");
        //Solución
        int incremento;
        incremento = 1;
        System.out.println(++incremento + " " + incremento++ + " " + incremento);

        //Ejercicio 14
        System.out.println("********");
        System.out.println("Ejercicio 14");
        System.out.println("********");
        //Solución
        int a = 1, b = 2, c = 3, d = 1;
        float r, s = (float)3.0;
        r = a + b / c + d / a;
        s = r - s;
        r = (long) s;
        r = ++r;
        System.out.println("El valor de r es: " + r);

        //Ejercicio 15
        System.out.println("********");
        System.out.println("Ejercicio 15");
        System.out.println("********");
        //Solución
        boolean valor1 = false, valor2 = false;
        int u = 3;
        x = 6;
        valor1 = (x < 5) || (x > u);
        valor2 = (x < 5) || (u == x);
        System.out.println("El valor de valor1 es: " + valor1);
        System.out.println("El valor de valor2 es: " + valor2);

        //Ejercicio 16
        System.out.println("********");
        System.out.println("Ejercicio 16");
        System.out.println("********");
        //Solución
        valor1 = false;
        valor2 = false;
        x = 6;
        u = 3;
        valor1 = (x < 5) && (x > u);
        valor2 = (x > 5) && (u == x);
        System.out.println("El valor de valor1 es: " + valor1);
        System.out.println("El valor de valor2 es: " + valor2);

        //Ejercicio 17
        System.out.println("********");
        System.out.println("Ejercicio 17");
        System.out.println("********");
        //Solución
        x = 2;
        u = 5;
        x *= u + 2;
        System.out.println("El valor de x es: " + x);

        //Ejercicio 18
        System.out.println("********");
        System.out.println("Ejercicio 18");
        System.out.println("********");
        //Solución
        char c0;
        c0 = 'c';
        System.out.printf("c = %c\n", c0);
        ++c0;
        System.out.printf("c = %c\n", c0);
        System.out.printf("c = %c%c\n", c0++, c0--);
        System.out.printf("c = %c\n", c0);

        //Ejercicio 19
        System.out.println("********");
        System.out.println("Ejercicio 19");
        System.out.println("********");
        //Solución
        u = 0;
        int n = 5;
        u = n++ + ++n;
        System.out.println(n + " " + u);

        //Ejercicio 20
        System.out.println("********");
        System.out.println("Ejercicio 20");
        System.out.println("********");
        //Solución
        boolean m = false, n0 = false, p, q;
        p = (!m) && (n0);
        q = (!m) || (n0);
        System.out.println("p= " + p + " q= " + q);

        //Ejercicio 21
        System.out.println("********");
        System.out.println("Ejercicio 21");
        System.out.println("********");
        //Solución
        int valor01 = 5, valor02 = 5;
        m = false;
        n0 = false;
        p = (valor01 >= valor02);
        q = (valor01 < valor02);
        System.out.println("p= " + p + " q= " + q);

        //Ejercicio 22
        System.out.println("********");
        System.out.println("Ejercicio 22");
        System.out.println("********");
        //Solución
        char a0 = 'a';
        x = 5;
        a0 += 5;
        x /= 3;
        System.out.println(a0 + " " + x);

        //Ejercicio 23
        System.out.println("********");
        System.out.println("Ejercicio 23");
        System.out.println("********");
        //Solución
        var1 = 1;
        int var2 = 1;
        boolean r0, s0;
        r0 = (var1++ < 2);
        System.out.println("r= " + r0 + " var1= " + var1);
        s0 = (++var2 < 2);
        System.out.println("s= " + s0 + " var2= " + var2);

        //Ejercicio 24
        System.out.println("********");
        System.out.println("Ejercicio 24");
        System.out.println("********");
        //Solución
        double saldo;
        saldo = (1 / 5) * 10;
        System.out.println(saldo * 5.0);

        //Ejercicio 25
        System.out.println("********");
        System.out.println("Ejercicio 25");
        System.out.println("********");
        //Solución
        int op;
        int a2 = 2, a8 = 8, a4 = 4, a1 = 1;
        op = a2 + a8 / a4 + a1;
        System.out.printf("op= %d\n", op);

        //Ejercicio 26
        System.out.println("********");
        System.out.println("Ejercicio 26");
        System.out.println("********");
        //Solución
        a = 2;
        b = 4;
        c = 4;
        System.out.println(a * b / 2 * c);

        //Ejercicio 27
        System.out.println("********");
        System.out.println("Ejercicio 27");
        System.out.println("********");
        //Solución
        System.out.println(3 + 11 / 5 * 2 + 3 % 2);

        //Ejercicio 28
        System.out.println("********");
        System.out.println("Ejercicio 28");
        System.out.println("********");
        //Solución
        double a01 = 2, b01 = 5;
        c = 2;
        int d0 = 1;
        x = (int)(b01 / a01) / c + d0;
        System.out.println("x: " + x);

        //Ejercicio 29
        System.out.println("********");
        System.out.println("Ejercicio 29");
        System.out.println("********");
        //Solución
        int num29, divisor29 = 0;
        num29 = 100;
        System.out.println("num inicial= " + num29);
        //num29 = num29 / divisor29;
        //num29 = num29 / 2;
        //System.out.print("num / 2= ");
        //System.out.println(num29);

        //Ejercicio 30
        System.out.println("********");
        System.out.println("Ejercicio 30");
        System.out.println("********");
        //Solución
        int m30 = 1, n30 = 4, k30 = 2, j30 = 1;
        float x30, valor30 = (float)1.1;
        x30 = m30 + n30 / k30 + j30;
        valor30 = x30 + valor30;
        x30 = (long) valor30;
        x30 = x30 + valor30;
        System.out.println(x30);

        //Ejercicio 31
        System.out.println("********");
        System.out.println("Ejercicio 31");
        System.out.println("********");
        //Solución
        int v1 = 1, v2 = 2, v3 = 3, v4 = 4;
        float v5, v6 =(float) 2.2;
        v5 = v4 + v3 * v2 - v1;
        v6 = v5 - v6;
        v5 = (long) v6;
        System.out.printf("%.1f %.1f\n", v5, v6);

        //Ejercicio 32
        System.out.println("********");
        System.out.println("Ejercicio 32");
        System.out.println("********");
        //Solución
        int a32, b32, c32;
        a32 = 2;
        b32 = 4;
        c32 = 4;
        System.out.println(a32 * b32 / 2 * c32);

        //Ejercicio 33
        System.out.println("********");
        System.out.println("Ejercicio 33");
        System.out.println("********");
        //Solución
        System.out.println("a)Se compara si la var seguir es true y devuelve true o false");
        System.out.println("b)Se asigna el valor true a la var seguir que tiene que ser boolean");

        //Ejercicio 34
        System.out.println("********");
        System.out.println("Ejercicio 34");
        System.out.println("********");
        //Solución
        char character;
        character = 'c';
        System.out.println("character: " + character);
        --character;
        System.out.println("character: " + character);
        System.out.println("character: " + character-- + character + character++ + character);

        //Ejercicio 35
        System.out.println("********");
        System.out.println("Ejercicio 35");
        System.out.println("********");
        //Solución
        int var35 = 1;
        boolean r35, s35, t35, v35;
        r35 = (var35 > 1) && (var35++ < 100);
        s35 = (100 < var35) && (150 > var35++);
        t35 = (100 == var35) || (200 > var35++);
        v35 = (100 == var35) || (200 > var35++);
        System.out.println(r35 + " " + s35 + " " + t35 + " " + v35);

        //Ejercicio 36
        System.out.println("********");
        System.out.println("Ejercicio 36");
        System.out.println("********");
        //Solución

        //Ejercicio 37
        System.out.println("********");
        System.out.println("Ejercicio 37");
        System.out.println("********");
        //Solución

    }
}
