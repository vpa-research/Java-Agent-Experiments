package org.huawei.optionalint;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        boolean boolean7 = optionalInt1.isPresent();
        boolean boolean8 = optionalInt1.isPresent();
        boolean boolean9 = optionalInt1.isPresent();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) ' ');
        int int2 = optionalInt1.orElseThrow();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.lang.String str5 = optionalInt1.toString();
        java.lang.String str6 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[32]" + "'", str5, "OptionalInt[32]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[32]" + "'", str6, "OptionalInt[32]");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        int int7 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        int int11 = optionalInt9.orElseThrow();
        java.util.OptionalInt optionalInt13 = java.util.OptionalInt.of((int) '4');
        java.util.function.IntSupplier intSupplier14 = null;
        int int15 = optionalInt13.orElseGet(intSupplier14);
        int int17 = optionalInt13.orElse((int) (byte) 1);
        boolean boolean18 = optionalInt9.equals((java.lang.Object) optionalInt13);
        java.util.stream.IntStream intStream19 = optionalInt9.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(optionalInt13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(intStream19);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        int int5 = optionalInt0.orElse((int) (short) 0);
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        java.lang.String str3 = optionalInt1.toString();
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        boolean boolean5 = optionalInt1.isPresent();
        java.lang.String str6 = optionalInt1.toString();
        java.util.stream.IntStream intStream7 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalInt[-1]" + "'", str3, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[-1]" + "'", str6, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        boolean boolean2 = optionalInt0.equals((java.lang.Object) '#');
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        boolean boolean4 = optionalInt0.isEmpty();
        java.lang.String str5 = optionalInt0.toString();
        boolean boolean6 = optionalInt0.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt.empty" + "'", str5, "OptionalInt.empty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.orElseThrow();
        int int3 = optionalInt1.orElseThrow();
        boolean boolean4 = optionalInt1.isEmpty();
        int int6 = optionalInt1.orElse((int) (byte) 1);
        int int8 = optionalInt1.orElse(0);
        int int9 = optionalInt1.orElseThrow();
        java.util.function.IntSupplier intSupplier10 = null;
        int int11 = optionalInt1.orElseGet(intSupplier10);
        boolean boolean12 = optionalInt1.isPresent();
        java.lang.String str13 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalInt[-1]" + "'", str13, "OptionalInt[-1]");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        boolean boolean7 = optionalInt1.isPresent();
        boolean boolean8 = optionalInt1.isPresent();
        int int9 = optionalInt1.orElseThrow();
        boolean boolean10 = optionalInt1.isPresent();
        boolean boolean11 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 1);
        boolean boolean2 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier3 = null;
        int int4 = optionalInt1.orElseGet(intSupplier3);
        boolean boolean5 = optionalInt1.isPresent();
        java.lang.Class<?> wildcardClass6 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        boolean boolean6 = optionalInt1.isPresent();
        int int7 = optionalInt1.getAsInt();
        java.util.stream.IntStream intStream8 = optionalInt1.stream();
        java.util.OptionalInt optionalInt10 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream11 = optionalInt10.stream();
        boolean boolean12 = optionalInt10.isEmpty();
        boolean boolean13 = optionalInt10.isPresent();
        int int14 = optionalInt10.getAsInt();
        java.util.function.IntSupplier intSupplier15 = null;
        int int16 = optionalInt10.orElseGet(intSupplier15);
        boolean boolean18 = optionalInt10.equals((java.lang.Object) '#');
        java.lang.String str19 = optionalInt10.toString();
        boolean boolean20 = optionalInt10.isPresent();
        java.util.OptionalInt optionalInt22 = java.util.OptionalInt.of((int) (short) -1);
        int int23 = optionalInt22.getAsInt();
        boolean boolean25 = optionalInt22.equals((java.lang.Object) (-1));
        java.lang.String str26 = optionalInt22.toString();
        boolean boolean27 = optionalInt22.isEmpty();
        boolean boolean28 = optionalInt10.equals((java.lang.Object) optionalInt22);
        boolean boolean29 = optionalInt1.equals((java.lang.Object) boolean28);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(optionalInt10);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "OptionalInt[-1]" + "'", str19, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(optionalInt22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "OptionalInt[-1]" + "'", str26, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        int int7 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        boolean boolean11 = optionalInt9.isPresent();
        java.util.function.IntConsumer intConsumer12 = null;
        java.lang.Runnable runnable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt9.ifPresentOrElse(intConsumer12, runnable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(100);
        int int3 = optionalInt1.orElse((int) '#');
        boolean boolean4 = optionalInt1.isPresent();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        java.lang.Object obj6 = null;
        boolean boolean7 = optionalInt1.equals(obj6);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        int int5 = optionalInt1.orElseThrow();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt1.orElseGet(intSupplier6);
        boolean boolean8 = optionalInt1.isEmpty();
        int int9 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        int int5 = optionalInt0.orElse(10);
        java.util.OptionalInt optionalInt7 = java.util.OptionalInt.of(10);
        java.lang.String str8 = optionalInt7.toString();
        java.util.stream.IntStream intStream9 = optionalInt7.stream();
        boolean boolean10 = optionalInt0.equals((java.lang.Object) optionalInt7);
        java.util.stream.IntStream intStream11 = optionalInt7.stream();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(optionalInt7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalInt[10]" + "'", str8, "OptionalInt[10]");
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intStream11);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        boolean boolean2 = optionalInt0.equals((java.lang.Object) '#');
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        java.util.function.IntConsumer intConsumer4 = null;
        optionalInt0.ifPresent(intConsumer4);
        java.util.OptionalInt optionalInt7 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream8 = optionalInt7.stream();
        boolean boolean9 = optionalInt7.isEmpty();
        boolean boolean11 = optionalInt7.equals((java.lang.Object) 0.0f);
        boolean boolean12 = optionalInt7.isEmpty();
        java.util.stream.IntStream intStream13 = optionalInt7.stream();
        boolean boolean14 = optionalInt0.equals((java.lang.Object) optionalInt7);
        boolean boolean15 = optionalInt0.isPresent();
        boolean boolean16 = optionalInt0.isPresent();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(optionalInt7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        int int6 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.stream.IntStream intStream9 = optionalInt1.stream();
        boolean boolean10 = optionalInt1.isEmpty();
        int int11 = optionalInt1.getAsInt();
        int int12 = optionalInt1.orElseThrow();
        boolean boolean13 = optionalInt1.isEmpty();
        java.util.function.IntConsumer intConsumer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean4 = optionalInt1.isPresent();
        int int5 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt1.orElseGet(intSupplier6);
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '#');
        java.lang.String str10 = optionalInt1.toString();
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream12 = optionalInt11.stream();
        java.util.stream.IntStream intStream13 = optionalInt11.stream();
        java.util.function.IntConsumer intConsumer14 = null;
        optionalInt11.ifPresent(intConsumer14);
        java.util.stream.IntStream intStream16 = optionalInt11.stream();
        boolean boolean17 = optionalInt1.equals((java.lang.Object) intStream16);
        java.util.stream.IntStream intStream18 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalInt[-1]" + "'", str10, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intStream18);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (byte) 100);
        java.lang.String str2 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[100]" + "'", str2, "OptionalInt[100]");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) '4');
        boolean boolean2 = optionalInt1.isEmpty();
        int int4 = optionalInt1.orElse(0);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        boolean boolean2 = optionalInt0.equals((java.lang.Object) '#');
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        java.util.function.IntConsumer intConsumer4 = null;
        optionalInt0.ifPresent(intConsumer4);
        java.util.function.IntConsumer intConsumer6 = null;
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt0.ifPresentOrElse(intConsumer6, runnable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intStream3);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        int int6 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.stream.IntStream intStream9 = optionalInt1.stream();
        boolean boolean10 = optionalInt1.isEmpty();
        int int11 = optionalInt1.getAsInt();
        int int12 = optionalInt1.orElseThrow();
        int int13 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt15 = java.util.OptionalInt.of((-1));
        boolean boolean16 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass17 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(optionalInt15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        boolean boolean2 = optionalInt1.isPresent();
        java.util.function.IntSupplier intSupplier3 = null;
        int int4 = optionalInt1.orElseGet(intSupplier3);
        int int5 = optionalInt1.orElseThrow();
        java.util.function.IntConsumer intConsumer6 = null;
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer6, runnable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.OptionalInt optionalInt3 = java.util.OptionalInt.of((int) (short) -1);
        int int4 = optionalInt3.getAsInt();
        boolean boolean6 = optionalInt3.equals((java.lang.Object) (-1));
        boolean boolean7 = optionalInt0.equals((java.lang.Object) boolean6);
        int int9 = optionalInt0.orElse((int) (short) 0);
        boolean boolean10 = optionalInt0.isPresent();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = optionalInt0.getAsInt();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(optionalInt3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) '#');
        boolean boolean2 = optionalInt1.isPresent();
        int int3 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean4 = optionalInt1.isPresent();
        int int5 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt1.orElseGet(intSupplier6);
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '#');
        java.lang.String str10 = optionalInt1.toString();
        int int12 = optionalInt1.orElse(52);
        boolean boolean13 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier14 = null;
        int int15 = optionalInt1.orElseGet(intSupplier14);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalInt[-1]" + "'", str10, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.OptionalInt optionalInt10 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream11 = optionalInt10.stream();
        boolean boolean12 = optionalInt10.isEmpty();
        boolean boolean14 = optionalInt10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalInt10.isEmpty();
        boolean boolean16 = optionalInt10.isEmpty();
        boolean boolean17 = optionalInt1.equals((java.lang.Object) optionalInt10);
        int int19 = optionalInt10.orElse((int) (short) 1);
        java.util.function.IntSupplier intSupplier20 = null;
        int int21 = optionalInt10.orElseGet(intSupplier20);
        boolean boolean22 = optionalInt10.isPresent();
        int int24 = optionalInt10.orElse((-1));
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(optionalInt10);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '4');
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        boolean boolean11 = optionalInt1.isPresent();
        int int13 = optionalInt1.orElse((int) (short) 10);
        boolean boolean14 = optionalInt1.isEmpty();
        boolean boolean15 = optionalInt1.isEmpty();
        java.util.OptionalInt optionalInt17 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream18 = optionalInt17.stream();
        boolean boolean19 = optionalInt17.isEmpty();
        boolean boolean21 = optionalInt17.equals((java.lang.Object) 0.0f);
        boolean boolean22 = optionalInt17.isEmpty();
        boolean boolean23 = optionalInt17.isEmpty();
        boolean boolean25 = optionalInt17.equals((java.lang.Object) '4');
        java.util.stream.IntStream intStream26 = optionalInt17.stream();
        boolean boolean27 = optionalInt17.isPresent();
        int int29 = optionalInt17.orElse((int) (byte) 1);
        java.util.stream.IntStream intStream30 = optionalInt17.stream();
        java.lang.String str31 = optionalInt17.toString();
        java.util.OptionalInt optionalInt32 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream33 = optionalInt32.stream();
        java.util.stream.IntStream intStream34 = optionalInt32.stream();
        java.util.function.IntConsumer intConsumer35 = null;
        optionalInt32.ifPresent(intConsumer35);
        boolean boolean37 = optionalInt32.isPresent();
        boolean boolean38 = optionalInt32.isPresent();
        int int40 = optionalInt32.orElse(0);
        int int42 = optionalInt32.orElse((int) (short) 100);
        boolean boolean43 = optionalInt17.equals((java.lang.Object) int42);
        boolean boolean44 = optionalInt1.equals((java.lang.Object) boolean43);
        int int45 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(optionalInt17);
        org.junit.Assert.assertNotNull(intStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(intStream26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(intStream30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "OptionalInt[-1]" + "'", str31, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(optionalInt32);
        org.junit.Assert.assertNotNull(intStream33);
        org.junit.Assert.assertNotNull(intStream34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        java.lang.String str3 = optionalInt1.toString();
        int int5 = optionalInt1.orElse((int) (byte) 0);
        boolean boolean6 = optionalInt1.isEmpty();
        int int8 = optionalInt1.orElse((int) ' ');
        int int9 = optionalInt1.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalInt[-1]" + "'", str3, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        java.util.OptionalInt optionalInt7 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream8 = optionalInt7.stream();
        boolean boolean9 = optionalInt7.isEmpty();
        java.util.function.IntSupplier intSupplier10 = null;
        int int11 = optionalInt7.orElseGet(intSupplier10);
        int int13 = optionalInt7.orElse((int) (byte) -1);
        int int15 = optionalInt7.orElse((int) ' ');
        boolean boolean16 = optionalInt1.equals((java.lang.Object) optionalInt7);
        java.util.function.IntConsumer intConsumer17 = null;
        java.lang.Runnable runnable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer17, runnable18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(optionalInt7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        java.lang.String str11 = optionalInt1.toString();
        int int12 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier13 = null;
        int int14 = optionalInt1.orElseGet(intSupplier13);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalInt[-1]" + "'", str11, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean4 = optionalInt1.isPresent();
        int int5 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt1.orElseGet(intSupplier6);
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '#');
        java.lang.String str10 = optionalInt1.toString();
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream12 = optionalInt11.stream();
        java.util.stream.IntStream intStream13 = optionalInt11.stream();
        java.util.function.IntConsumer intConsumer14 = null;
        optionalInt11.ifPresent(intConsumer14);
        java.util.stream.IntStream intStream16 = optionalInt11.stream();
        boolean boolean17 = optionalInt1.equals((java.lang.Object) intStream16);
        boolean boolean18 = optionalInt1.isEmpty();
        java.lang.String str19 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalInt[-1]" + "'", str10, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "OptionalInt[-1]" + "'", str19, "OptionalInt[-1]");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.lang.String str2 = optionalInt1.toString();
        int int3 = optionalInt1.orElseThrow();
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        int int6 = optionalInt1.orElse((int) (byte) 0);
        java.lang.String str7 = optionalInt1.toString();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier10 = null;
        int int11 = optionalInt9.orElseGet(intSupplier10);
        int int13 = optionalInt9.orElse((int) (short) 10);
        java.lang.String str14 = optionalInt9.toString();
        int int15 = optionalInt9.orElseThrow();
        java.util.OptionalInt optionalInt17 = java.util.OptionalInt.of(10);
        boolean boolean18 = optionalInt9.equals((java.lang.Object) optionalInt17);
        java.util.function.IntSupplier intSupplier19 = null;
        int int20 = optionalInt9.orElseGet(intSupplier19);
        java.lang.String str21 = optionalInt9.toString();
        int int22 = optionalInt9.orElseThrow();
        boolean boolean23 = optionalInt1.equals((java.lang.Object) optionalInt9);
        int int24 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[10]" + "'", str2, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalInt[10]" + "'", str7, "OptionalInt[10]");
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OptionalInt[1]" + "'", str14, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(optionalInt17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "OptionalInt[1]" + "'", str21, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.OptionalInt optionalInt3 = java.util.OptionalInt.of((int) (short) -1);
        int int4 = optionalInt3.getAsInt();
        boolean boolean6 = optionalInt3.equals((java.lang.Object) (-1));
        boolean boolean7 = optionalInt0.equals((java.lang.Object) boolean6);
        int int9 = optionalInt0.orElse((int) (short) 0);
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream12 = optionalInt11.stream();
        boolean boolean13 = optionalInt11.isEmpty();
        boolean boolean15 = optionalInt11.equals((java.lang.Object) 0.0f);
        boolean boolean16 = optionalInt11.isEmpty();
        java.util.function.IntSupplier intSupplier17 = null;
        int int18 = optionalInt11.orElseGet(intSupplier17);
        java.util.OptionalInt optionalInt20 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream21 = optionalInt20.stream();
        boolean boolean22 = optionalInt20.isEmpty();
        boolean boolean24 = optionalInt20.equals((java.lang.Object) 0.0f);
        boolean boolean25 = optionalInt20.isEmpty();
        boolean boolean26 = optionalInt20.isEmpty();
        boolean boolean27 = optionalInt11.equals((java.lang.Object) optionalInt20);
        java.lang.Class<?> wildcardClass28 = optionalInt11.getClass();
        boolean boolean29 = optionalInt0.equals((java.lang.Object) optionalInt11);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = optionalInt0.getAsInt();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(optionalInt3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(optionalInt20);
        org.junit.Assert.assertNotNull(intStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '4');
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        java.lang.Object obj11 = null;
        boolean boolean12 = optionalInt1.equals(obj11);
        java.util.OptionalInt optionalInt14 = java.util.OptionalInt.of(0);
        int int15 = optionalInt14.getAsInt();
        int int16 = optionalInt14.orElseThrow();
        int int17 = optionalInt14.getAsInt();
        java.lang.String str18 = optionalInt14.toString();
        int int19 = optionalInt14.getAsInt();
        boolean boolean20 = optionalInt1.equals((java.lang.Object) optionalInt14);
        java.util.function.IntSupplier intSupplier21 = null;
        int int22 = optionalInt1.orElseGet(intSupplier21);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(optionalInt14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "OptionalInt[0]" + "'", str18, "OptionalInt[0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        boolean boolean9 = optionalInt1.isPresent();
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.of((int) '4');
        boolean boolean12 = optionalInt1.equals((java.lang.Object) optionalInt11);
        int int13 = optionalInt1.orElseThrow();
        java.util.function.IntSupplier intSupplier14 = null;
        int int15 = optionalInt1.orElseGet(intSupplier14);
        java.util.OptionalInt optionalInt17 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream18 = optionalInt17.stream();
        boolean boolean19 = optionalInt17.isEmpty();
        boolean boolean21 = optionalInt17.equals((java.lang.Object) 0.0f);
        boolean boolean22 = optionalInt17.isEmpty();
        boolean boolean23 = optionalInt17.isEmpty();
        boolean boolean25 = optionalInt17.equals((java.lang.Object) '4');
        java.util.stream.IntStream intStream26 = optionalInt17.stream();
        boolean boolean27 = optionalInt17.isPresent();
        int int29 = optionalInt17.orElse((int) (short) 10);
        boolean boolean30 = optionalInt1.equals((java.lang.Object) optionalInt17);
        int int31 = optionalInt17.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(optionalInt17);
        org.junit.Assert.assertNotNull(intStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(intStream26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 0);
        boolean boolean2 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier3 = null;
        int int4 = optionalInt1.orElseGet(intSupplier3);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream7 = optionalInt6.stream();
        boolean boolean8 = optionalInt6.isEmpty();
        java.util.function.IntSupplier intSupplier9 = null;
        int int10 = optionalInt6.orElseGet(intSupplier9);
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.empty();
        boolean boolean12 = optionalInt6.equals((java.lang.Object) optionalInt11);
        java.util.OptionalInt optionalInt14 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier15 = null;
        int int16 = optionalInt14.orElseGet(intSupplier15);
        java.util.stream.IntStream intStream17 = optionalInt14.stream();
        boolean boolean18 = optionalInt11.equals((java.lang.Object) intStream17);
        java.util.stream.IntStream intStream19 = optionalInt11.stream();
        boolean boolean20 = optionalInt11.isPresent();
        boolean boolean21 = optionalInt11.isPresent();
        boolean boolean22 = optionalInt1.equals((java.lang.Object) optionalInt11);
        java.util.function.IntSupplier intSupplier23 = null;
        int int24 = optionalInt1.orElseGet(intSupplier23);
        java.util.function.IntConsumer intConsumer25 = null;
        java.lang.Runnable runnable26 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer25, runnable26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(optionalInt14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(intStream19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        boolean boolean9 = optionalInt1.isPresent();
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        int int11 = optionalInt1.getAsInt();
        boolean boolean12 = optionalInt1.isPresent();
        int int13 = optionalInt1.orElseThrow();
        java.util.function.IntSupplier intSupplier14 = null;
        int int15 = optionalInt1.orElseGet(intSupplier14);
        java.util.function.IntConsumer intConsumer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean4 = optionalInt1.isPresent();
        int int5 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt1.orElseGet(intSupplier6);
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '#');
        boolean boolean10 = optionalInt1.isPresent();
        boolean boolean11 = optionalInt1.isPresent();
        java.util.function.IntConsumer intConsumer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        boolean boolean6 = optionalInt1.isEmpty();
        int int8 = optionalInt1.orElse((int) (byte) 100);
        boolean boolean9 = optionalInt1.isPresent();
        boolean boolean10 = optionalInt1.isEmpty();
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream12 = optionalInt11.stream();
        java.util.stream.IntStream intStream13 = optionalInt11.stream();
        java.util.stream.IntStream intStream14 = optionalInt11.stream();
        int int16 = optionalInt11.orElse(10);
        java.util.OptionalInt optionalInt18 = java.util.OptionalInt.of(10);
        java.lang.String str19 = optionalInt18.toString();
        java.util.stream.IntStream intStream20 = optionalInt18.stream();
        boolean boolean21 = optionalInt11.equals((java.lang.Object) optionalInt18);
        boolean boolean22 = optionalInt1.equals((java.lang.Object) optionalInt18);
        boolean boolean23 = optionalInt1.isPresent();
        java.util.OptionalInt optionalInt25 = java.util.OptionalInt.of((int) (short) -1);
        int int26 = optionalInt25.getAsInt();
        boolean boolean28 = optionalInt25.equals((java.lang.Object) (-1));
        java.lang.String str29 = optionalInt25.toString();
        boolean boolean30 = optionalInt25.isPresent();
        java.lang.Object obj31 = null;
        boolean boolean32 = optionalInt25.equals(obj31);
        int int34 = optionalInt25.orElse(1);
        int int35 = optionalInt25.orElseThrow();
        boolean boolean36 = optionalInt1.equals((java.lang.Object) int35);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(optionalInt18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "OptionalInt[10]" + "'", str19, "OptionalInt[10]");
        org.junit.Assert.assertNotNull(intStream20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(optionalInt25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "OptionalInt[-1]" + "'", str29, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.stream.IntStream intStream7 = optionalInt1.stream();
        java.util.function.IntSupplier intSupplier8 = null;
        int int9 = optionalInt1.orElseGet(intSupplier8);
        boolean boolean10 = optionalInt1.isPresent();
        boolean boolean11 = optionalInt1.isPresent();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        boolean boolean6 = optionalInt1.isEmpty();
        int int8 = optionalInt1.orElse((int) (byte) 100);
        java.util.stream.IntStream intStream9 = optionalInt1.stream();
        int int10 = optionalInt1.getAsInt();
        java.lang.String str11 = optionalInt1.toString();
        int int12 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalInt[-1]" + "'", str11, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.OptionalInt optionalInt3 = java.util.OptionalInt.of((int) (short) -1);
        int int4 = optionalInt3.getAsInt();
        boolean boolean6 = optionalInt3.equals((java.lang.Object) (-1));
        boolean boolean7 = optionalInt0.equals((java.lang.Object) boolean6);
        java.util.stream.IntStream intStream8 = optionalInt0.stream();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(optionalInt3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        java.util.stream.IntStream intStream6 = optionalInt1.stream();
        boolean boolean7 = optionalInt1.isPresent();
        boolean boolean8 = optionalInt1.isEmpty();
        boolean boolean9 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        boolean boolean6 = optionalInt1.isPresent();
        int int7 = optionalInt1.getAsInt();
        java.lang.String str8 = optionalInt1.toString();
        java.util.function.IntConsumer intConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalInt[0]" + "'", str8, "OptionalInt[0]");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        int int9 = optionalInt1.orElse((int) (byte) 1);
        boolean boolean10 = optionalInt1.isEmpty();
        java.util.function.IntConsumer intConsumer11 = null;
        java.lang.Runnable runnable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer11, runnable12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse(0);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.stream.IntStream intStream7 = optionalInt1.stream();
        boolean boolean8 = optionalInt1.isEmpty();
        boolean boolean9 = optionalInt1.isEmpty();
        int int10 = optionalInt1.getAsInt();
        int int11 = optionalInt1.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.function.IntConsumer intConsumer3 = null;
        optionalInt0.ifPresent(intConsumer3);
        boolean boolean5 = optionalInt0.isPresent();
        int int7 = optionalInt0.orElse((int) (short) 0);
        java.lang.String str8 = optionalInt0.toString();
        java.util.stream.IntStream intStream9 = optionalInt0.stream();
        java.lang.String str10 = optionalInt0.toString();
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalInt.empty" + "'", str8, "OptionalInt.empty");
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalInt.empty" + "'", str10, "OptionalInt.empty");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        int int6 = optionalInt1.getAsInt();
        int int7 = optionalInt1.getAsInt();
        int int8 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier9 = null;
        int int10 = optionalInt1.orElseGet(intSupplier9);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(100);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        int int3 = optionalInt1.orElseThrow();
        int int4 = optionalInt1.orElseThrow();
        boolean boolean5 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        int int6 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.stream.IntStream intStream9 = optionalInt1.stream();
        boolean boolean10 = optionalInt1.isEmpty();
        int int11 = optionalInt1.getAsInt();
        int int12 = optionalInt1.orElseThrow();
        java.util.stream.IntStream intStream13 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intStream13);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.lang.String str2 = optionalInt1.toString();
        int int3 = optionalInt1.orElseThrow();
        boolean boolean4 = optionalInt1.isPresent();
        java.lang.String str5 = optionalInt1.toString();
        int int7 = optionalInt1.orElse((int) (byte) 10);
        java.lang.String str8 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[-1]" + "'", str2, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalInt[-1]" + "'", str8, "OptionalInt[-1]");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        int int7 = optionalInt1.orElse((int) (byte) -1);
        boolean boolean8 = optionalInt1.isEmpty();
        int int9 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int4 = optionalInt1.orElseThrow();
        int int5 = optionalInt1.orElseThrow();
        int int6 = optionalInt1.getAsInt();
        java.lang.String str7 = optionalInt1.toString();
        java.util.function.IntSupplier intSupplier8 = null;
        int int9 = optionalInt1.orElseGet(intSupplier8);
        int int11 = optionalInt1.orElse(0);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalInt[0]" + "'", str7, "OptionalInt[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '4');
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        java.lang.Object obj11 = null;
        boolean boolean12 = optionalInt1.equals(obj11);
        java.util.OptionalInt optionalInt14 = java.util.OptionalInt.of(0);
        int int15 = optionalInt14.getAsInt();
        int int16 = optionalInt14.orElseThrow();
        int int17 = optionalInt14.getAsInt();
        java.lang.String str18 = optionalInt14.toString();
        int int19 = optionalInt14.getAsInt();
        boolean boolean20 = optionalInt1.equals((java.lang.Object) optionalInt14);
        java.lang.String str21 = optionalInt1.toString();
        boolean boolean22 = optionalInt1.isPresent();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(optionalInt14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "OptionalInt[0]" + "'", str18, "OptionalInt[0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "OptionalInt[-1]" + "'", str21, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        boolean boolean6 = optionalInt1.isEmpty();
        int int8 = optionalInt1.orElse((int) (byte) 100);
        boolean boolean9 = optionalInt1.isPresent();
        int int10 = optionalInt1.getAsInt();
        int int11 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) '#');
        int int2 = optionalInt1.getAsInt();
        boolean boolean3 = optionalInt1.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        boolean boolean6 = optionalInt1.isPresent();
        int int7 = optionalInt1.orElseThrow();
        int int8 = optionalInt1.orElseThrow();
        int int9 = optionalInt1.getAsInt();
        int int10 = optionalInt1.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.OptionalInt optionalInt10 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream11 = optionalInt10.stream();
        boolean boolean12 = optionalInt10.isEmpty();
        boolean boolean14 = optionalInt10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalInt10.isEmpty();
        boolean boolean16 = optionalInt10.isEmpty();
        boolean boolean17 = optionalInt1.equals((java.lang.Object) optionalInt10);
        int int18 = optionalInt10.getAsInt();
        java.util.function.IntSupplier intSupplier19 = null;
        int int20 = optionalInt10.orElseGet(intSupplier19);
        java.lang.String str21 = optionalInt10.toString();
        boolean boolean22 = optionalInt10.isPresent();
        java.util.function.IntConsumer intConsumer23 = null;
        java.lang.Runnable runnable24 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt10.ifPresentOrElse(intConsumer23, runnable24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(optionalInt10);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "OptionalInt[-1]" + "'", str21, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean4 = optionalInt1.isPresent();
        int int5 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt1.orElseGet(intSupplier6);
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '#');
        java.lang.String str10 = optionalInt1.toString();
        boolean boolean11 = optionalInt1.isPresent();
        java.util.OptionalInt optionalInt13 = java.util.OptionalInt.of((int) (short) -1);
        int int14 = optionalInt13.getAsInt();
        boolean boolean16 = optionalInt13.equals((java.lang.Object) (-1));
        java.lang.String str17 = optionalInt13.toString();
        boolean boolean18 = optionalInt13.isEmpty();
        boolean boolean19 = optionalInt1.equals((java.lang.Object) optionalInt13);
        boolean boolean20 = optionalInt13.isEmpty();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalInt[-1]" + "'", str10, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(optionalInt13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "OptionalInt[-1]" + "'", str17, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.lang.String str2 = optionalInt1.toString();
        int int3 = optionalInt1.orElseThrow();
        boolean boolean4 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.isPresent();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt1.orElseGet(intSupplier6);
        java.lang.String str8 = optionalInt1.toString();
        int int10 = optionalInt1.orElse((int) (byte) 10);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalInt[10]" + "'", str2, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalInt[10]" + "'", str8, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        java.util.stream.IntStream intStream11 = optionalInt9.stream();
        int int13 = optionalInt9.orElse(10);
        boolean boolean14 = optionalInt9.isPresent();
        java.util.OptionalInt optionalInt16 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream17 = optionalInt16.stream();
        boolean boolean18 = optionalInt16.isEmpty();
        java.util.function.IntSupplier intSupplier19 = null;
        int int20 = optionalInt16.orElseGet(intSupplier19);
        java.util.OptionalInt optionalInt21 = java.util.OptionalInt.empty();
        boolean boolean22 = optionalInt16.equals((java.lang.Object) optionalInt21);
        java.util.OptionalInt optionalInt24 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier25 = null;
        int int26 = optionalInt24.orElseGet(intSupplier25);
        java.util.stream.IntStream intStream27 = optionalInt24.stream();
        boolean boolean28 = optionalInt21.equals((java.lang.Object) intStream27);
        boolean boolean29 = optionalInt9.equals((java.lang.Object) optionalInt21);
        int int31 = optionalInt21.orElse((int) (short) 100);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(optionalInt16);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(optionalInt21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(optionalInt24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(intStream27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.lang.String str4 = optionalInt1.toString();
        java.lang.String str5 = optionalInt1.toString();
        int int6 = optionalInt1.getAsInt();
        int int7 = optionalInt1.getAsInt();
        java.lang.Class<?> wildcardClass8 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalInt[10]" + "'", str4, "OptionalInt[10]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[10]" + "'", str5, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 1);
        boolean boolean2 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier3 = null;
        int int4 = optionalInt1.orElseGet(intSupplier3);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.of((int) (short) -1);
        int int7 = optionalInt6.orElseThrow();
        int int8 = optionalInt6.orElseThrow();
        java.util.stream.IntStream intStream9 = optionalInt6.stream();
        boolean boolean10 = optionalInt1.equals((java.lang.Object) intStream9);
        int int12 = optionalInt1.orElse(35);
        int int13 = optionalInt1.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        boolean boolean7 = optionalInt1.isPresent();
        int int8 = optionalInt1.orElseThrow();
        java.lang.String str9 = optionalInt1.toString();
        java.lang.String str10 = optionalInt1.toString();
        java.util.OptionalInt optionalInt12 = java.util.OptionalInt.of((int) (short) 1);
        boolean boolean13 = optionalInt12.isEmpty();
        java.lang.String str14 = optionalInt12.toString();
        java.util.stream.IntStream intStream15 = optionalInt12.stream();
        boolean boolean16 = optionalInt1.equals((java.lang.Object) optionalInt12);
        int int17 = optionalInt12.getAsInt();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalInt[1]" + "'", str9, "OptionalInt[1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalInt[1]" + "'", str10, "OptionalInt[1]");
        org.junit.Assert.assertNotNull(optionalInt12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OptionalInt[1]" + "'", str14, "OptionalInt[1]");
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        java.lang.String str8 = optionalInt6.toString();
        boolean boolean9 = optionalInt6.isPresent();
        java.util.function.IntSupplier intSupplier10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = optionalInt6.orElseGet(intSupplier10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntSupplier.getAsInt()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalInt.empty" + "'", str8, "OptionalInt.empty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(100);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        int int6 = optionalInt1.orElse(0);
        int int8 = optionalInt1.orElse(0);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        java.lang.String str3 = optionalInt1.toString();
        java.lang.String str4 = optionalInt1.toString();
        int int5 = optionalInt1.getAsInt();
        int int6 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalInt[-1]" + "'", str3, "OptionalInt[-1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalInt[-1]" + "'", str4, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '4');
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        boolean boolean11 = optionalInt1.isPresent();
        int int13 = optionalInt1.orElse((int) (short) 10);
        int int14 = optionalInt1.orElseThrow();
        boolean boolean15 = optionalInt1.isEmpty();
        java.lang.String str16 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OptionalInt[-1]" + "'", str16, "OptionalInt[-1]");
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        java.lang.String str3 = optionalInt1.toString();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt1.orElseGet(intSupplier6);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalInt[-1]" + "'", str3, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        int int7 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        java.util.function.IntSupplier intSupplier11 = null;
        int int12 = optionalInt1.orElseGet(intSupplier11);
        java.lang.String str13 = optionalInt1.toString();
        int int14 = optionalInt1.orElseThrow();
        boolean boolean15 = optionalInt1.isPresent();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalInt[1]" + "'", str13, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) ' ');
        int int2 = optionalInt1.orElseThrow();
        java.util.stream.IntStream intStream3 = optionalInt1.stream();
        int int4 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.lang.String str4 = optionalInt1.toString();
        java.lang.String str5 = optionalInt1.toString();
        int int6 = optionalInt1.getAsInt();
        int int7 = optionalInt1.getAsInt();
        java.lang.String str8 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalInt[10]" + "'", str4, "OptionalInt[10]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[10]" + "'", str5, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OptionalInt[10]" + "'", str8, "OptionalInt[10]");
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier4 = null;
        int int5 = optionalInt1.orElseGet(intSupplier4);
        java.util.OptionalInt optionalInt6 = java.util.OptionalInt.empty();
        boolean boolean7 = optionalInt1.equals((java.lang.Object) optionalInt6);
        boolean boolean8 = optionalInt1.isPresent();
        int int9 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(optionalInt6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        boolean boolean7 = optionalInt1.isPresent();
        int int8 = optionalInt1.orElseThrow();
        boolean boolean9 = optionalInt1.isPresent();
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        java.util.function.IntSupplier intSupplier11 = null;
        int int12 = optionalInt1.orElseGet(intSupplier11);
        int int13 = optionalInt1.orElseThrow();
        int int14 = optionalInt1.getAsInt();
        java.util.OptionalInt optionalInt16 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream17 = optionalInt16.stream();
        boolean boolean18 = optionalInt16.isEmpty();
        boolean boolean19 = optionalInt16.isPresent();
        int int20 = optionalInt16.getAsInt();
        java.util.function.IntSupplier intSupplier21 = null;
        int int22 = optionalInt16.orElseGet(intSupplier21);
        boolean boolean24 = optionalInt16.equals((java.lang.Object) '#');
        boolean boolean25 = optionalInt16.isPresent();
        java.util.stream.IntStream intStream26 = optionalInt16.stream();
        boolean boolean27 = optionalInt1.equals((java.lang.Object) optionalInt16);
        int int29 = optionalInt1.orElse(35);
        java.lang.String str30 = optionalInt1.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(optionalInt16);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intStream26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "OptionalInt[1]" + "'", str30, "OptionalInt[1]");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.OptionalInt optionalInt10 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream11 = optionalInt10.stream();
        boolean boolean12 = optionalInt10.isEmpty();
        boolean boolean14 = optionalInt10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalInt10.isEmpty();
        boolean boolean16 = optionalInt10.isEmpty();
        boolean boolean17 = optionalInt1.equals((java.lang.Object) optionalInt10);
        int int18 = optionalInt10.getAsInt();
        java.util.function.IntSupplier intSupplier19 = null;
        int int20 = optionalInt10.orElseGet(intSupplier19);
        boolean boolean21 = optionalInt10.isPresent();
        java.util.function.IntSupplier intSupplier22 = null;
        int int23 = optionalInt10.orElseGet(intSupplier22);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(optionalInt10);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '4');
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        boolean boolean11 = optionalInt1.isPresent();
        int int13 = optionalInt1.orElse((int) (short) 10);
        int int14 = optionalInt1.getAsInt();
        int int16 = optionalInt1.orElse(0);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        boolean boolean7 = optionalInt1.isPresent();
        int int8 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt10 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream11 = optionalInt10.stream();
        boolean boolean12 = optionalInt10.isEmpty();
        boolean boolean14 = optionalInt10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalInt10.isEmpty();
        java.util.function.IntSupplier intSupplier16 = null;
        int int17 = optionalInt10.orElseGet(intSupplier16);
        java.util.OptionalInt optionalInt19 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream20 = optionalInt19.stream();
        boolean boolean21 = optionalInt19.isEmpty();
        boolean boolean23 = optionalInt19.equals((java.lang.Object) 0.0f);
        boolean boolean24 = optionalInt19.isEmpty();
        boolean boolean25 = optionalInt19.isEmpty();
        boolean boolean26 = optionalInt10.equals((java.lang.Object) optionalInt19);
        int int28 = optionalInt19.orElse((int) (short) 1);
        boolean boolean29 = optionalInt1.equals((java.lang.Object) optionalInt19);
        java.util.OptionalInt optionalInt31 = java.util.OptionalInt.of(1);
        boolean boolean32 = optionalInt31.isPresent();
        java.util.function.IntSupplier intSupplier33 = null;
        int int34 = optionalInt31.orElseGet(intSupplier33);
        int int35 = optionalInt31.orElseThrow();
        int int36 = optionalInt31.getAsInt();
        boolean boolean37 = optionalInt19.equals((java.lang.Object) optionalInt31);
        java.util.OptionalInt optionalInt39 = java.util.OptionalInt.of((int) (short) -1);
        int int40 = optionalInt39.getAsInt();
        boolean boolean42 = optionalInt39.equals((java.lang.Object) (-1));
        java.lang.String str43 = optionalInt39.toString();
        boolean boolean44 = optionalInt39.isEmpty();
        int int46 = optionalInt39.orElse((int) (byte) 100);
        boolean boolean47 = optionalInt39.isPresent();
        boolean boolean48 = optionalInt39.isEmpty();
        java.util.OptionalInt optionalInt49 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream50 = optionalInt49.stream();
        java.util.stream.IntStream intStream51 = optionalInt49.stream();
        java.util.stream.IntStream intStream52 = optionalInt49.stream();
        int int54 = optionalInt49.orElse(10);
        java.util.OptionalInt optionalInt56 = java.util.OptionalInt.of(10);
        java.lang.String str57 = optionalInt56.toString();
        java.util.stream.IntStream intStream58 = optionalInt56.stream();
        boolean boolean59 = optionalInt49.equals((java.lang.Object) optionalInt56);
        boolean boolean60 = optionalInt39.equals((java.lang.Object) optionalInt56);
        boolean boolean61 = optionalInt31.equals((java.lang.Object) optionalInt39);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(optionalInt10);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(optionalInt19);
        org.junit.Assert.assertNotNull(intStream20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(optionalInt31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(optionalInt39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "OptionalInt[-1]" + "'", str43, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(optionalInt49);
        org.junit.Assert.assertNotNull(intStream50);
        org.junit.Assert.assertNotNull(intStream51);
        org.junit.Assert.assertNotNull(intStream52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertNotNull(optionalInt56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "OptionalInt[10]" + "'", str57, "OptionalInt[10]");
        org.junit.Assert.assertNotNull(intStream58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.getAsInt();
        boolean boolean4 = optionalInt1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalInt1.toString();
        int int6 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.function.IntSupplier intSupplier9 = null;
        int int10 = optionalInt1.orElseGet(intSupplier9);
        java.util.stream.IntStream intStream11 = optionalInt1.stream();
        int int13 = optionalInt1.orElse(0);
        java.util.function.IntSupplier intSupplier14 = null;
        int int15 = optionalInt1.orElseGet(intSupplier14);
        java.util.OptionalInt optionalInt17 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier18 = null;
        int int19 = optionalInt17.orElseGet(intSupplier18);
        int int21 = optionalInt17.orElse((int) (short) 10);
        java.lang.String str22 = optionalInt17.toString();
        boolean boolean23 = optionalInt17.isPresent();
        int int24 = optionalInt17.orElseThrow();
        boolean boolean25 = optionalInt17.isPresent();
        java.util.stream.IntStream intStream26 = optionalInt17.stream();
        java.util.function.IntSupplier intSupplier27 = null;
        int int28 = optionalInt17.orElseGet(intSupplier27);
        int int29 = optionalInt17.orElseThrow();
        int int30 = optionalInt17.getAsInt();
        java.util.OptionalInt optionalInt32 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream33 = optionalInt32.stream();
        boolean boolean34 = optionalInt32.isEmpty();
        boolean boolean35 = optionalInt32.isPresent();
        int int36 = optionalInt32.getAsInt();
        java.util.function.IntSupplier intSupplier37 = null;
        int int38 = optionalInt32.orElseGet(intSupplier37);
        boolean boolean40 = optionalInt32.equals((java.lang.Object) '#');
        boolean boolean41 = optionalInt32.isPresent();
        java.util.stream.IntStream intStream42 = optionalInt32.stream();
        boolean boolean43 = optionalInt17.equals((java.lang.Object) optionalInt32);
        java.util.stream.IntStream intStream44 = optionalInt17.stream();
        boolean boolean45 = optionalInt1.equals((java.lang.Object) optionalInt17);
        java.util.function.IntConsumer intConsumer46 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[-1]" + "'", str5, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(optionalInt17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "OptionalInt[1]" + "'", str22, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intStream26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(optionalInt32);
        org.junit.Assert.assertNotNull(intStream33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(intStream42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(intStream44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse(0);
        int int7 = optionalInt1.orElse(1);
        int int8 = optionalInt1.getAsInt();
        boolean boolean9 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier10 = null;
        int int11 = optionalInt1.orElseGet(intSupplier10);
        java.lang.String str12 = optionalInt1.toString();
        java.lang.String str13 = optionalInt1.toString();
        int int14 = optionalInt1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OptionalInt[1]" + "'", str12, "OptionalInt[1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalInt[1]" + "'", str13, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        java.util.OptionalInt optionalInt10 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream11 = optionalInt10.stream();
        boolean boolean12 = optionalInt10.isEmpty();
        boolean boolean14 = optionalInt10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalInt10.isEmpty();
        boolean boolean16 = optionalInt10.isEmpty();
        boolean boolean17 = optionalInt1.equals((java.lang.Object) optionalInt10);
        int int18 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt20 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream21 = optionalInt20.stream();
        boolean boolean22 = optionalInt20.isEmpty();
        boolean boolean24 = optionalInt20.equals((java.lang.Object) 0.0f);
        boolean boolean25 = optionalInt20.isEmpty();
        java.util.function.IntSupplier intSupplier26 = null;
        int int27 = optionalInt20.orElseGet(intSupplier26);
        java.util.OptionalInt optionalInt29 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream30 = optionalInt29.stream();
        boolean boolean31 = optionalInt29.isEmpty();
        boolean boolean33 = optionalInt29.equals((java.lang.Object) 0.0f);
        boolean boolean34 = optionalInt29.isEmpty();
        boolean boolean35 = optionalInt29.isEmpty();
        boolean boolean36 = optionalInt20.equals((java.lang.Object) optionalInt29);
        java.lang.Class<?> wildcardClass37 = optionalInt20.getClass();
        boolean boolean38 = optionalInt1.equals((java.lang.Object) optionalInt20);
        int int40 = optionalInt1.orElse((int) (short) 10);
        int int41 = optionalInt1.orElseThrow();
        boolean boolean42 = optionalInt1.isPresent();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(optionalInt10);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(optionalInt20);
        org.junit.Assert.assertNotNull(intStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(optionalInt29);
        org.junit.Assert.assertNotNull(intStream30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        int int5 = optionalInt1.orElseThrow();
        boolean boolean6 = optionalInt1.isEmpty();
        java.util.function.IntSupplier intSupplier7 = null;
        int int8 = optionalInt1.orElseGet(intSupplier7);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.stream.IntStream intStream3 = optionalInt0.stream();
        int int5 = optionalInt0.orElse(10);
        java.util.function.IntConsumer intConsumer6 = null;
        optionalInt0.ifPresent(intConsumer6);
        boolean boolean8 = optionalInt0.isPresent();
        java.util.OptionalInt optionalInt10 = java.util.OptionalInt.of((int) (short) 0);
        boolean boolean11 = optionalInt10.isEmpty();
        java.util.function.IntSupplier intSupplier12 = null;
        int int13 = optionalInt10.orElseGet(intSupplier12);
        java.lang.Class<?> wildcardClass14 = optionalInt10.getClass();
        boolean boolean15 = optionalInt0.equals((java.lang.Object) optionalInt10);
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(optionalInt10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        int int2 = optionalInt1.orElseThrow();
        int int3 = optionalInt1.orElseThrow();
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        boolean boolean5 = optionalInt1.isPresent();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '4');
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        boolean boolean11 = optionalInt1.isPresent();
        int int13 = optionalInt1.orElse((int) (byte) 1);
        java.util.stream.IntStream intStream14 = optionalInt1.stream();
        java.util.stream.IntStream intStream15 = optionalInt1.stream();
        java.util.function.IntSupplier intSupplier16 = null;
        int int17 = optionalInt1.orElseGet(intSupplier16);
        java.util.OptionalInt optionalInt19 = java.util.OptionalInt.of((int) '4');
        java.util.function.IntSupplier intSupplier20 = null;
        int int21 = optionalInt19.orElseGet(intSupplier20);
        int int23 = optionalInt19.orElse((int) (byte) 1);
        int int24 = optionalInt19.orElseThrow();
        boolean boolean25 = optionalInt1.equals((java.lang.Object) optionalInt19);
        java.lang.Class<?> wildcardClass26 = optionalInt1.getClass();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(optionalInt19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) 0);
        java.util.OptionalInt optionalInt3 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream4 = optionalInt3.stream();
        boolean boolean5 = optionalInt3.isEmpty();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt3.orElseGet(intSupplier6);
        java.util.OptionalInt optionalInt8 = java.util.OptionalInt.empty();
        boolean boolean9 = optionalInt3.equals((java.lang.Object) optionalInt8);
        java.util.OptionalInt optionalInt11 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier12 = null;
        int int13 = optionalInt11.orElseGet(intSupplier12);
        java.util.stream.IntStream intStream14 = optionalInt11.stream();
        boolean boolean15 = optionalInt8.equals((java.lang.Object) intStream14);
        java.util.stream.IntStream intStream16 = optionalInt8.stream();
        boolean boolean17 = optionalInt8.isPresent();
        boolean boolean18 = optionalInt8.isPresent();
        boolean boolean19 = optionalInt1.equals((java.lang.Object) boolean18);
        int int20 = optionalInt1.getAsInt();
        boolean boolean21 = optionalInt1.isPresent();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(optionalInt3);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(optionalInt8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionalInt11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        int int6 = optionalInt1.getAsInt();
        java.util.function.IntConsumer intConsumer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) '4');
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (byte) 1);
        int int6 = optionalInt1.orElseThrow();
        boolean boolean7 = optionalInt1.isPresent();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        int int7 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        java.util.function.IntSupplier intSupplier11 = null;
        int int12 = optionalInt9.orElseGet(intSupplier11);
        java.util.function.IntConsumer intConsumer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt9.ifPresent(intConsumer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '4');
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        java.lang.Object obj11 = null;
        boolean boolean12 = optionalInt1.equals(obj11);
        int int13 = optionalInt1.getAsInt();
        java.util.function.IntConsumer intConsumer14 = null;
        java.lang.Runnable runnable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer14, runnable15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        int int6 = optionalInt1.getAsInt();
        java.util.OptionalInt optionalInt8 = java.util.OptionalInt.of((int) (short) -1);
        int int9 = optionalInt8.getAsInt();
        boolean boolean11 = optionalInt8.equals((java.lang.Object) (-1));
        java.lang.String str12 = optionalInt8.toString();
        int int13 = optionalInt8.getAsInt();
        java.util.function.IntSupplier intSupplier14 = null;
        int int15 = optionalInt8.orElseGet(intSupplier14);
        java.util.stream.IntStream intStream16 = optionalInt8.stream();
        boolean boolean17 = optionalInt1.equals((java.lang.Object) optionalInt8);
        int int18 = optionalInt8.orElseThrow();
        java.lang.String str19 = optionalInt8.toString();
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(optionalInt8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OptionalInt[-1]" + "'", str12, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "OptionalInt[-1]" + "'", str19, "OptionalInt[-1]");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        int int7 = optionalInt1.orElseThrow();
        java.util.OptionalInt optionalInt9 = java.util.OptionalInt.of(10);
        boolean boolean10 = optionalInt1.equals((java.lang.Object) optionalInt9);
        java.util.OptionalInt optionalInt12 = java.util.OptionalInt.of(0);
        int int13 = optionalInt12.getAsInt();
        int int14 = optionalInt12.orElseThrow();
        int int15 = optionalInt12.getAsInt();
        int int16 = optionalInt12.orElseThrow();
        java.util.function.IntSupplier intSupplier17 = null;
        int int18 = optionalInt12.orElseGet(intSupplier17);
        boolean boolean19 = optionalInt12.isPresent();
        boolean boolean20 = optionalInt9.equals((java.lang.Object) optionalInt12);
        java.util.OptionalInt optionalInt22 = java.util.OptionalInt.of((int) '#');
        int int23 = optionalInt22.getAsInt();
        java.util.OptionalInt optionalInt25 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream26 = optionalInt25.stream();
        boolean boolean27 = optionalInt25.isEmpty();
        java.util.function.IntSupplier intSupplier28 = null;
        int int29 = optionalInt25.orElseGet(intSupplier28);
        java.util.OptionalInt optionalInt30 = java.util.OptionalInt.empty();
        boolean boolean31 = optionalInt25.equals((java.lang.Object) optionalInt30);
        java.util.OptionalInt optionalInt33 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier34 = null;
        int int35 = optionalInt33.orElseGet(intSupplier34);
        java.util.stream.IntStream intStream36 = optionalInt33.stream();
        boolean boolean37 = optionalInt30.equals((java.lang.Object) intStream36);
        boolean boolean38 = optionalInt30.isEmpty();
        boolean boolean39 = optionalInt22.equals((java.lang.Object) optionalInt30);
        java.util.OptionalInt optionalInt41 = java.util.OptionalInt.of((int) (short) -1);
        int int42 = optionalInt41.orElseThrow();
        int int43 = optionalInt41.orElseThrow();
        java.lang.String str44 = optionalInt41.toString();
        boolean boolean45 = optionalInt22.equals((java.lang.Object) optionalInt41);
        boolean boolean46 = optionalInt9.equals((java.lang.Object) optionalInt41);
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(optionalInt9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(optionalInt12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(optionalInt22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertNotNull(optionalInt25);
        org.junit.Assert.assertNotNull(intStream26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(optionalInt30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(optionalInt33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(intStream36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(optionalInt41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "OptionalInt[-1]" + "'", str44, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean5 = optionalInt1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalInt1.isEmpty();
        boolean boolean7 = optionalInt1.isEmpty();
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '4');
        java.util.stream.IntStream intStream10 = optionalInt1.stream();
        boolean boolean11 = optionalInt1.isPresent();
        int int13 = optionalInt1.orElse((int) (short) 10);
        boolean boolean14 = optionalInt1.isEmpty();
        boolean boolean15 = optionalInt1.isPresent();
        java.util.function.IntConsumer intConsumer16 = null;
        java.lang.Runnable runnable17 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer16, runnable17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        java.util.stream.IntStream intStream5 = optionalInt1.stream();
        int int6 = optionalInt1.orElseThrow();
        boolean boolean7 = optionalInt1.isPresent();
        int int8 = optionalInt1.getAsInt();
        java.util.function.IntConsumer intConsumer9 = null;
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer9, runnable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(0);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.util.stream.IntStream intStream4 = optionalInt1.stream();
        int int5 = optionalInt1.orElseThrow();
        int int6 = optionalInt1.getAsInt();
        java.util.function.IntConsumer intConsumer7 = null;
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer7, runnable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of((int) (short) -1);
        java.util.stream.IntStream intStream2 = optionalInt1.stream();
        boolean boolean3 = optionalInt1.isEmpty();
        boolean boolean4 = optionalInt1.isPresent();
        int int5 = optionalInt1.getAsInt();
        java.util.function.IntSupplier intSupplier6 = null;
        int int7 = optionalInt1.orElseGet(intSupplier6);
        boolean boolean9 = optionalInt1.equals((java.lang.Object) '#');
        java.lang.String str10 = optionalInt1.toString();
        boolean boolean11 = optionalInt1.isPresent();
        java.lang.String str12 = optionalInt1.toString();
        java.util.function.IntConsumer intConsumer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OptionalInt[-1]" + "'", str10, "OptionalInt[-1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OptionalInt[-1]" + "'", str12, "OptionalInt[-1]");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(10);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        java.lang.String str4 = optionalInt1.toString();
        java.lang.String str5 = optionalInt1.toString();
        int int6 = optionalInt1.getAsInt();
        boolean boolean7 = optionalInt1.isEmpty();
        java.util.function.IntConsumer intConsumer8 = null;
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresentOrElse(intConsumer8, runnable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalInt[10]" + "'", str4, "OptionalInt[10]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalInt[10]" + "'", str5, "OptionalInt[10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        boolean boolean1 = optionalInt0.isPresent();
        java.util.function.IntConsumer intConsumer2 = null;
        optionalInt0.ifPresent(intConsumer2);
        int int5 = optionalInt0.orElse(1);
        java.util.function.IntConsumer intConsumer6 = null;
        optionalInt0.ifPresent(intConsumer6);
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        java.util.OptionalInt optionalInt0 = java.util.OptionalInt.empty();
        java.util.stream.IntStream intStream1 = optionalInt0.stream();
        java.util.stream.IntStream intStream2 = optionalInt0.stream();
        java.util.function.IntConsumer intConsumer3 = null;
        optionalInt0.ifPresent(intConsumer3);
        java.util.function.IntConsumer intConsumer5 = null;
        optionalInt0.ifPresent(intConsumer5);
        java.lang.String str7 = optionalInt0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = optionalInt0.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt0);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalInt.empty" + "'", str7, "OptionalInt.empty");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        java.util.OptionalInt optionalInt1 = java.util.OptionalInt.of(1);
        System.out.println(optionalInt1);
        java.util.function.IntSupplier intSupplier2 = null;
        int int3 = optionalInt1.orElseGet(intSupplier2);
        int int5 = optionalInt1.orElse((int) (short) 10);
        java.lang.String str6 = optionalInt1.toString();
        int int7 = optionalInt1.orElseThrow();
        int int8 = optionalInt1.getAsInt();
        java.util.function.IntConsumer intConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalInt1.ifPresent(intConsumer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.IntConsumer.accept(int)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalInt1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalInt[1]" + "'", str6, "OptionalInt[1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }
}

