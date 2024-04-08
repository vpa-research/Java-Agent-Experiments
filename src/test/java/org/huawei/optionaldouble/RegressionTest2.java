package org.huawei.optionaldouble;

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
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.lang.String str2 = optionalDouble1.toString();
        java.util.OptionalDouble optionalDouble3 = java.util.OptionalDouble.empty();
        boolean boolean4 = optionalDouble3.isPresent();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) boolean4);
        java.util.function.DoubleSupplier doubleSupplier6 = null;
        double double7 = optionalDouble1.orElseGet(doubleSupplier6);
        boolean boolean8 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier9 = null;
        double double10 = optionalDouble1.orElseGet(doubleSupplier9);
        java.lang.String str11 = optionalDouble1.toString();
        boolean boolean12 = optionalDouble1.isEmpty();
        double double13 = optionalDouble1.getAsDouble();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalDouble[100.0]" + "'", str2, "OptionalDouble[100.0]");
        org.junit.Assert.assertNotNull(optionalDouble3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalDouble[100.0]" + "'", str11, "OptionalDouble[100.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10);
        java.lang.String str2 = optionalDouble1.toString();
        double double3 = optionalDouble1.orElseThrow();
        java.util.stream.DoubleStream doubleStream4 = optionalDouble1.stream();
        java.lang.Class<?> wildcardClass5 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalDouble[10.0]" + "'", str2, "OptionalDouble[10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.empty();
        boolean boolean7 = optionalDouble1.equals((java.lang.Object) optionalDouble6);
        java.util.OptionalDouble optionalDouble9 = java.util.OptionalDouble.of(0.0d);
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble9.orElseGet(doubleSupplier10);
        java.util.stream.DoubleStream doubleStream12 = optionalDouble9.stream();
        boolean boolean13 = optionalDouble6.equals((java.lang.Object) doubleStream12);
        java.util.stream.DoubleStream doubleStream14 = optionalDouble6.stream();
        boolean boolean15 = optionalDouble6.isPresent();
        java.util.OptionalDouble optionalDouble17 = java.util.OptionalDouble.of((double) 10);
        java.lang.String str18 = optionalDouble17.toString();
        double double19 = optionalDouble17.orElseThrow();
        java.util.stream.DoubleStream doubleStream20 = optionalDouble17.stream();
        double double21 = optionalDouble17.orElseThrow();
        double double22 = optionalDouble17.orElseThrow();
        boolean boolean23 = optionalDouble6.equals((java.lang.Object) double22);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalDouble9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(optionalDouble17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "OptionalDouble[10.0]" + "'", str18, "OptionalDouble[10.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalDouble1.toString();
        java.util.stream.DoubleStream doubleStream6 = optionalDouble1.stream();
        boolean boolean7 = optionalDouble1.isPresent();
        java.util.OptionalDouble optionalDouble9 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream10 = optionalDouble9.stream();
        boolean boolean11 = optionalDouble9.isEmpty();
        boolean boolean13 = optionalDouble9.equals((java.lang.Object) 0.0f);
        boolean boolean14 = optionalDouble9.isEmpty();
        boolean boolean15 = optionalDouble9.isEmpty();
        double double17 = optionalDouble9.orElse((double) 100.0f);
        double double18 = optionalDouble9.orElseThrow();
        java.util.stream.DoubleStream doubleStream19 = optionalDouble9.stream();
        boolean boolean20 = optionalDouble1.equals((java.lang.Object) doubleStream19);
        double double21 = optionalDouble1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalDouble[100.0]" + "'", str5, "OptionalDouble[100.0]");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(optionalDouble9);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.util.function.DoubleSupplier doubleSupplier5 = null;
        double double6 = optionalDouble1.orElseGet(doubleSupplier5);
        double double8 = optionalDouble1.orElse((double) (byte) 0);
        java.util.function.DoubleConsumer doubleConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalDouble1.toString();
        double double6 = optionalDouble1.getAsDouble();
        double double8 = optionalDouble1.orElse((double) (short) 10);
        double double10 = optionalDouble1.orElse((double) (short) 0);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble1.stream();
        double double12 = optionalDouble1.getAsDouble();
        boolean boolean13 = optionalDouble1.isEmpty();
        java.lang.String str14 = optionalDouble1.toString();
        java.util.function.DoubleSupplier doubleSupplier15 = null;
        double double16 = optionalDouble1.orElseGet(doubleSupplier15);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalDouble[100.0]" + "'", str5, "OptionalDouble[100.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OptionalDouble[100.0]" + "'", str14, "OptionalDouble[100.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        double double4 = optionalDouble1.getAsDouble();
        boolean boolean5 = optionalDouble1.isPresent();
        boolean boolean6 = optionalDouble1.isEmpty();
        double double7 = optionalDouble1.getAsDouble();
        boolean boolean8 = optionalDouble1.isEmpty();
        double double9 = optionalDouble1.orElseThrow();
        double double11 = optionalDouble1.orElse((double) 0);
        double double13 = optionalDouble1.orElse(32.0d);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.util.function.DoubleSupplier doubleSupplier5 = null;
        double double6 = optionalDouble1.orElseGet(doubleSupplier5);
        double double7 = optionalDouble1.getAsDouble();
        java.lang.Class<?> wildcardClass8 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        java.util.OptionalDouble optionalDouble19 = java.util.OptionalDouble.empty();
        java.lang.Class<?> wildcardClass20 = optionalDouble19.getClass();
        boolean boolean21 = optionalDouble1.equals((java.lang.Object) optionalDouble19);
        java.util.stream.DoubleStream doubleStream22 = optionalDouble19.stream();
        java.lang.Class<?> wildcardClass23 = doubleStream22.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(doubleStream22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.lang.String str2 = optionalDouble1.toString();
        java.util.OptionalDouble optionalDouble3 = java.util.OptionalDouble.empty();
        boolean boolean4 = optionalDouble3.isPresent();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) boolean4);
        java.util.function.DoubleConsumer doubleConsumer6 = null;
        java.lang.Runnable runnable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer6, runnable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalDouble[100.0]" + "'", str2, "OptionalDouble[100.0]");
        org.junit.Assert.assertNotNull(optionalDouble3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean4 = optionalDouble1.isPresent();
        double double5 = optionalDouble1.getAsDouble();
        double double6 = optionalDouble1.orElseThrow();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        boolean boolean9 = optionalDouble1.isEmpty();
        java.util.stream.DoubleStream doubleStream10 = optionalDouble1.stream();
        java.util.stream.DoubleStream doubleStream11 = optionalDouble1.stream();
        double double12 = optionalDouble1.getAsDouble();
        double double14 = optionalDouble1.orElse(0.0d);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 1);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        java.lang.String str3 = optionalDouble1.toString();
        java.util.stream.DoubleStream doubleStream4 = optionalDouble1.stream();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalDouble[1.0]" + "'", str3, "OptionalDouble[1.0]");
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalDouble1.toString();
        double double6 = optionalDouble1.getAsDouble();
        double double8 = optionalDouble1.orElse(35.0d);
        boolean boolean9 = optionalDouble1.isEmpty();
        double double10 = optionalDouble1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalDouble[100.0]" + "'", str5, "OptionalDouble[100.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.OptionalDouble optionalDouble3 = java.util.OptionalDouble.of((double) 100L);
        double double4 = optionalDouble3.getAsDouble();
        boolean boolean6 = optionalDouble3.equals((java.lang.Object) (-1));
        boolean boolean7 = optionalDouble0.equals((java.lang.Object) boolean6);
        java.util.function.DoubleConsumer doubleConsumer8 = null;
        optionalDouble0.ifPresent(doubleConsumer8);
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = optionalDouble0.orElseGet(doubleSupplier10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleSupplier.getAsDouble()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(optionalDouble3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        java.util.function.DoubleSupplier doubleSupplier19 = null;
        double double20 = optionalDouble1.orElseGet(doubleSupplier19);
        java.util.stream.DoubleStream doubleStream21 = optionalDouble1.stream();
        double double23 = optionalDouble1.orElse((double) (byte) -1);
        double double24 = optionalDouble1.getAsDouble();
        boolean boolean25 = optionalDouble1.isPresent();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream21);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.lang.String str3 = optionalDouble0.toString();
        java.lang.Class<?> wildcardClass4 = optionalDouble0.getClass();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalDouble.empty" + "'", str3, "OptionalDouble.empty");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        double double5 = optionalDouble1.orElse((double) 'a');
        java.lang.String str6 = optionalDouble1.toString();
        boolean boolean7 = optionalDouble1.isPresent();
        java.util.function.DoubleSupplier doubleSupplier8 = null;
        double double9 = optionalDouble1.orElseGet(doubleSupplier8);
        double double10 = optionalDouble1.orElseThrow();
        java.lang.String str11 = optionalDouble1.toString();
        java.lang.Class<?> wildcardClass12 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalDouble[1.0]" + "'", str6, "OptionalDouble[1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OptionalDouble[1.0]" + "'", str11, "OptionalDouble[1.0]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of(0.0d);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        java.util.stream.DoubleStream doubleStream4 = optionalDouble1.stream();
        java.util.stream.DoubleStream doubleStream5 = optionalDouble1.stream();
        boolean boolean6 = optionalDouble1.isEmpty();
        double double7 = optionalDouble1.getAsDouble();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean4 = optionalDouble1.isPresent();
        double double5 = optionalDouble1.getAsDouble();
        double double6 = optionalDouble1.orElseThrow();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        boolean boolean9 = optionalDouble1.isEmpty();
        java.util.stream.DoubleStream doubleStream10 = optionalDouble1.stream();
        boolean boolean11 = optionalDouble1.isEmpty();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalDouble1.toString();
        double double7 = optionalDouble1.orElse((double) 1);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalDouble[100.0]" + "'", str5, "OptionalDouble[100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1L);
        double double3 = optionalDouble1.orElse((double) (short) 100);
        boolean boolean4 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier5 = null;
        double double6 = optionalDouble1.orElseGet(doubleSupplier5);
        java.util.function.DoubleConsumer doubleConsumer7 = null;
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer7, runnable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100);
        boolean boolean2 = optionalDouble1.isEmpty();
        double double3 = optionalDouble1.orElseThrow();
        double double4 = optionalDouble1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10);
        java.lang.String str2 = optionalDouble1.toString();
        double double3 = optionalDouble1.getAsDouble();
        java.lang.String str4 = optionalDouble1.toString();
        boolean boolean5 = optionalDouble1.isPresent();
        java.lang.String str6 = optionalDouble1.toString();
        java.lang.String str7 = optionalDouble1.toString();
        double double8 = optionalDouble1.getAsDouble();
        java.util.function.DoubleSupplier doubleSupplier9 = null;
        double double10 = optionalDouble1.orElseGet(doubleSupplier9);
        java.util.function.DoubleConsumer doubleConsumer11 = null;
        java.lang.Runnable runnable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer11, runnable12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalDouble[10.0]" + "'", str2, "OptionalDouble[10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalDouble[10.0]" + "'", str4, "OptionalDouble[10.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalDouble[10.0]" + "'", str6, "OptionalDouble[10.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OptionalDouble[10.0]" + "'", str7, "OptionalDouble[10.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of(0.0d);
        java.lang.String str2 = optionalDouble1.toString();
        double double3 = optionalDouble1.orElseThrow();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.lang.String str6 = optionalDouble1.toString();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalDouble[0.0]" + "'", str2, "OptionalDouble[0.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalDouble[0.0]" + "'", str6, "OptionalDouble[0.0]");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        double double4 = optionalDouble1.getAsDouble();
        boolean boolean5 = optionalDouble1.isPresent();
        java.util.function.DoubleSupplier doubleSupplier6 = null;
        double double7 = optionalDouble1.orElseGet(doubleSupplier6);
        boolean boolean9 = optionalDouble1.equals((java.lang.Object) "OptionalDouble[-1.0]");
        java.util.function.DoubleConsumer doubleConsumer10 = null;
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer10, runnable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.orElseThrow();
        double double3 = optionalDouble1.orElseThrow();
        java.util.stream.DoubleStream doubleStream4 = optionalDouble1.stream();
        double double6 = optionalDouble1.orElse((double) 10);
        boolean boolean7 = optionalDouble1.isEmpty();
        java.util.function.DoubleConsumer doubleConsumer8 = null;
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer8, runnable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1L);
        double double2 = optionalDouble1.getAsDouble();
        java.lang.String str3 = optionalDouble1.toString();
        java.lang.Class<?> wildcardClass4 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalDouble[1.0]" + "'", str3, "OptionalDouble[1.0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10);
        java.lang.String str2 = optionalDouble1.toString();
        double double3 = optionalDouble1.orElseThrow();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        double double6 = optionalDouble1.getAsDouble();
        boolean boolean7 = optionalDouble1.isEmpty();
        double double9 = optionalDouble1.orElse((double) (short) 10);
        java.util.function.DoubleConsumer doubleConsumer10 = null;
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer10, runnable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalDouble[10.0]" + "'", str2, "OptionalDouble[10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        boolean boolean2 = optionalDouble0.equals((java.lang.Object) '#');
        java.util.OptionalDouble optionalDouble4 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream5 = optionalDouble4.stream();
        boolean boolean6 = optionalDouble4.isEmpty();
        boolean boolean8 = optionalDouble4.equals((java.lang.Object) 0.0f);
        boolean boolean9 = optionalDouble4.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble4.orElseGet(doubleSupplier10);
        java.util.OptionalDouble optionalDouble13 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream14 = optionalDouble13.stream();
        boolean boolean15 = optionalDouble13.isEmpty();
        boolean boolean17 = optionalDouble13.equals((java.lang.Object) 0.0f);
        boolean boolean18 = optionalDouble13.isEmpty();
        boolean boolean19 = optionalDouble13.isEmpty();
        boolean boolean20 = optionalDouble4.equals((java.lang.Object) optionalDouble13);
        double double21 = optionalDouble4.orElseThrow();
        boolean boolean22 = optionalDouble4.isEmpty();
        java.util.stream.DoubleStream doubleStream23 = optionalDouble4.stream();
        boolean boolean24 = optionalDouble0.equals((java.lang.Object) optionalDouble4);
        boolean boolean25 = optionalDouble0.isEmpty();
        java.util.stream.DoubleStream doubleStream26 = optionalDouble0.stream();
        double double28 = optionalDouble0.orElse((double) 0.0f);
        boolean boolean29 = optionalDouble0.isPresent();
        double double31 = optionalDouble0.orElse((double) (-1.0f));
        java.util.function.DoubleConsumer doubleConsumer32 = null;
        java.lang.Runnable runnable33 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble0.ifPresentOrElse(doubleConsumer32, runnable33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionalDouble4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble13);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(doubleStream26);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        double double5 = optionalDouble1.orElse((double) 'a');
        java.lang.String str6 = optionalDouble1.toString();
        double double8 = optionalDouble1.orElse((double) 1);
        java.lang.String str9 = optionalDouble1.toString();
        boolean boolean10 = optionalDouble1.isEmpty();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalDouble[1.0]" + "'", str6, "OptionalDouble[1.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalDouble[1.0]" + "'", str9, "OptionalDouble[1.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (-1.0f));
        java.util.OptionalDouble optionalDouble3 = java.util.OptionalDouble.of(0.0d);
        boolean boolean4 = optionalDouble3.isEmpty();
        boolean boolean6 = optionalDouble3.equals((java.lang.Object) (-1));
        boolean boolean7 = optionalDouble1.equals((java.lang.Object) (-1));
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(optionalDouble3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        double double4 = optionalDouble1.getAsDouble();
        boolean boolean5 = optionalDouble1.isPresent();
        boolean boolean6 = optionalDouble1.isEmpty();
        double double8 = optionalDouble1.orElse((double) '#');
        java.util.function.DoubleConsumer doubleConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        double double4 = optionalDouble1.getAsDouble();
        boolean boolean5 = optionalDouble1.isPresent();
        java.util.OptionalDouble optionalDouble7 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream8 = optionalDouble7.stream();
        boolean boolean9 = optionalDouble7.isEmpty();
        boolean boolean11 = optionalDouble7.equals((java.lang.Object) 0.0f);
        boolean boolean12 = optionalDouble7.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier13 = null;
        double double14 = optionalDouble7.orElseGet(doubleSupplier13);
        java.util.OptionalDouble optionalDouble16 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream17 = optionalDouble16.stream();
        boolean boolean18 = optionalDouble16.isEmpty();
        boolean boolean20 = optionalDouble16.equals((java.lang.Object) 0.0f);
        boolean boolean21 = optionalDouble16.isEmpty();
        boolean boolean22 = optionalDouble16.isEmpty();
        boolean boolean23 = optionalDouble7.equals((java.lang.Object) optionalDouble16);
        double double24 = optionalDouble7.orElseThrow();
        boolean boolean25 = optionalDouble7.isEmpty();
        boolean boolean26 = optionalDouble1.equals((java.lang.Object) optionalDouble7);
        java.util.function.DoubleSupplier doubleSupplier27 = null;
        double double28 = optionalDouble7.orElseGet(doubleSupplier27);
        java.util.function.DoubleConsumer doubleConsumer29 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble7.ifPresent(doubleConsumer29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(optionalDouble7);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble16);
        org.junit.Assert.assertNotNull(doubleStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean4 = optionalDouble1.isPresent();
        java.util.stream.DoubleStream doubleStream5 = optionalDouble1.stream();
        boolean boolean6 = optionalDouble1.isEmpty();
        double double7 = optionalDouble1.getAsDouble();
        double double8 = optionalDouble1.orElseThrow();
        boolean boolean9 = optionalDouble1.isEmpty();
        double double11 = optionalDouble1.orElse((double) (byte) -1);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        boolean boolean19 = optionalDouble1.isEmpty();
        double double20 = optionalDouble1.getAsDouble();
        double double21 = optionalDouble1.getAsDouble();
        double double22 = optionalDouble1.getAsDouble();
        java.util.OptionalDouble optionalDouble24 = java.util.OptionalDouble.of((double) (byte) 1);
        java.util.stream.DoubleStream doubleStream25 = optionalDouble24.stream();
        boolean boolean26 = optionalDouble1.equals((java.lang.Object) optionalDouble24);
        java.lang.String str27 = optionalDouble24.toString();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble24);
        org.junit.Assert.assertNotNull(doubleStream25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "OptionalDouble[1.0]" + "'", str27, "OptionalDouble[1.0]");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        java.util.function.DoubleSupplier doubleSupplier18 = null;
        double double19 = optionalDouble1.orElseGet(doubleSupplier18);
        double double21 = optionalDouble1.orElse((double) '4');
        java.util.OptionalDouble optionalDouble23 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream24 = optionalDouble23.stream();
        boolean boolean25 = optionalDouble23.isEmpty();
        boolean boolean26 = optionalDouble1.equals((java.lang.Object) optionalDouble23);
        boolean boolean27 = optionalDouble23.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier28 = null;
        double double29 = optionalDouble23.orElseGet(doubleSupplier28);
        java.lang.String str30 = optionalDouble23.toString();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble23);
        org.junit.Assert.assertNotNull(doubleStream24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "OptionalDouble[100.0]" + "'", str30, "OptionalDouble[100.0]");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        boolean boolean7 = optionalDouble1.isEmpty();
        boolean boolean9 = optionalDouble1.equals((java.lang.Object) '4');
        double double10 = optionalDouble1.getAsDouble();
        double double11 = optionalDouble1.getAsDouble();
        boolean boolean12 = optionalDouble1.isPresent();
        double double14 = optionalDouble1.orElse((double) (short) 1);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        boolean boolean2 = optionalDouble0.equals((java.lang.Object) '#');
        java.util.OptionalDouble optionalDouble4 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream5 = optionalDouble4.stream();
        boolean boolean6 = optionalDouble4.isEmpty();
        boolean boolean8 = optionalDouble4.equals((java.lang.Object) 0.0f);
        boolean boolean9 = optionalDouble4.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble4.orElseGet(doubleSupplier10);
        java.util.OptionalDouble optionalDouble13 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream14 = optionalDouble13.stream();
        boolean boolean15 = optionalDouble13.isEmpty();
        boolean boolean17 = optionalDouble13.equals((java.lang.Object) 0.0f);
        boolean boolean18 = optionalDouble13.isEmpty();
        boolean boolean19 = optionalDouble13.isEmpty();
        boolean boolean20 = optionalDouble4.equals((java.lang.Object) optionalDouble13);
        double double21 = optionalDouble4.orElseThrow();
        boolean boolean22 = optionalDouble4.isEmpty();
        java.util.stream.DoubleStream doubleStream23 = optionalDouble4.stream();
        boolean boolean24 = optionalDouble0.equals((java.lang.Object) optionalDouble4);
        java.util.OptionalDouble optionalDouble26 = java.util.OptionalDouble.of(0.0d);
        double double27 = optionalDouble26.getAsDouble();
        boolean boolean28 = optionalDouble26.isPresent();
        boolean boolean29 = optionalDouble4.equals((java.lang.Object) boolean28);
        java.util.OptionalDouble optionalDouble31 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream32 = optionalDouble31.stream();
        boolean boolean33 = optionalDouble31.isEmpty();
        boolean boolean35 = optionalDouble31.equals((java.lang.Object) 0.0f);
        boolean boolean36 = optionalDouble31.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier37 = null;
        double double38 = optionalDouble31.orElseGet(doubleSupplier37);
        java.util.OptionalDouble optionalDouble40 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream41 = optionalDouble40.stream();
        boolean boolean42 = optionalDouble40.isEmpty();
        boolean boolean44 = optionalDouble40.equals((java.lang.Object) 0.0f);
        boolean boolean45 = optionalDouble40.isEmpty();
        boolean boolean46 = optionalDouble40.isEmpty();
        boolean boolean47 = optionalDouble31.equals((java.lang.Object) optionalDouble40);
        boolean boolean48 = optionalDouble4.equals((java.lang.Object) optionalDouble31);
        double double49 = optionalDouble31.orElseThrow();
        java.lang.Class<?> wildcardClass50 = optionalDouble31.getClass();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionalDouble4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble13);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(optionalDouble26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(optionalDouble31);
        org.junit.Assert.assertNotNull(doubleStream32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble40);
        org.junit.Assert.assertNotNull(doubleStream41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (short) -1);
        boolean boolean2 = optionalDouble1.isPresent();
        double double3 = optionalDouble1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1L);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.util.OptionalDouble optionalDouble7 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream8 = optionalDouble7.stream();
        boolean boolean9 = optionalDouble7.isEmpty();
        boolean boolean11 = optionalDouble7.equals((java.lang.Object) 0.0f);
        boolean boolean12 = optionalDouble7.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier13 = null;
        double double14 = optionalDouble7.orElseGet(doubleSupplier13);
        java.util.OptionalDouble optionalDouble16 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream17 = optionalDouble16.stream();
        boolean boolean18 = optionalDouble16.isEmpty();
        boolean boolean20 = optionalDouble16.equals((java.lang.Object) 0.0f);
        boolean boolean21 = optionalDouble16.isEmpty();
        boolean boolean22 = optionalDouble16.isEmpty();
        boolean boolean23 = optionalDouble7.equals((java.lang.Object) optionalDouble16);
        boolean boolean24 = optionalDouble7.isPresent();
        boolean boolean26 = optionalDouble7.equals((java.lang.Object) (-1));
        boolean boolean27 = optionalDouble1.equals((java.lang.Object) (-1));
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(optionalDouble7);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble16);
        org.junit.Assert.assertNotNull(doubleStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        boolean boolean7 = optionalDouble1.isEmpty();
        double double9 = optionalDouble1.orElse((double) 100.0f);
        double double11 = optionalDouble1.orElse(0.0d);
        java.util.function.DoubleSupplier doubleSupplier12 = null;
        double double13 = optionalDouble1.orElseGet(doubleSupplier12);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean4 = optionalDouble1.isPresent();
        double double5 = optionalDouble1.getAsDouble();
        java.lang.Object obj6 = null;
        boolean boolean7 = optionalDouble1.equals(obj6);
        java.util.stream.DoubleStream doubleStream8 = optionalDouble1.stream();
        java.lang.String str9 = optionalDouble1.toString();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalDouble[100.0]" + "'", str9, "OptionalDouble[100.0]");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (-1L));
        boolean boolean2 = optionalDouble1.isEmpty();
        boolean boolean3 = optionalDouble1.isEmpty();
        double double4 = optionalDouble1.getAsDouble();
        boolean boolean5 = optionalDouble1.isEmpty();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10);
        double double3 = optionalDouble1.orElse((double) 1L);
        java.util.OptionalDouble optionalDouble5 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream6 = optionalDouble5.stream();
        boolean boolean7 = optionalDouble5.isEmpty();
        boolean boolean9 = optionalDouble5.equals((java.lang.Object) 0.0f);
        boolean boolean10 = optionalDouble5.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier11 = null;
        double double12 = optionalDouble5.orElseGet(doubleSupplier11);
        java.util.OptionalDouble optionalDouble14 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream15 = optionalDouble14.stream();
        boolean boolean16 = optionalDouble14.isEmpty();
        boolean boolean18 = optionalDouble14.equals((java.lang.Object) 0.0f);
        boolean boolean19 = optionalDouble14.isEmpty();
        boolean boolean20 = optionalDouble14.isEmpty();
        boolean boolean21 = optionalDouble5.equals((java.lang.Object) optionalDouble14);
        double double22 = optionalDouble5.orElseThrow();
        boolean boolean23 = optionalDouble5.isEmpty();
        double double24 = optionalDouble5.getAsDouble();
        double double25 = optionalDouble5.getAsDouble();
        java.util.OptionalDouble optionalDouble27 = java.util.OptionalDouble.of((double) 1);
        java.util.function.DoubleSupplier doubleSupplier28 = null;
        double double29 = optionalDouble27.orElseGet(doubleSupplier28);
        double double31 = optionalDouble27.orElse((double) 'a');
        java.lang.String str32 = optionalDouble27.toString();
        double double34 = optionalDouble27.orElse((double) 1);
        java.util.OptionalDouble optionalDouble36 = java.util.OptionalDouble.of((double) 1L);
        double double38 = optionalDouble36.orElse((double) (short) 100);
        java.util.OptionalDouble optionalDouble40 = java.util.OptionalDouble.of((double) 1L);
        boolean boolean41 = optionalDouble36.equals((java.lang.Object) optionalDouble40);
        java.util.OptionalDouble optionalDouble43 = java.util.OptionalDouble.of(0.0d);
        java.util.function.DoubleSupplier doubleSupplier44 = null;
        double double45 = optionalDouble43.orElseGet(doubleSupplier44);
        java.lang.Class<?> wildcardClass46 = optionalDouble43.getClass();
        boolean boolean47 = optionalDouble36.equals((java.lang.Object) wildcardClass46);
        boolean boolean48 = optionalDouble27.equals((java.lang.Object) boolean47);
        boolean boolean49 = optionalDouble27.isEmpty();
        java.lang.String str50 = optionalDouble27.toString();
        double double52 = optionalDouble27.orElse((double) 10.0f);
        boolean boolean53 = optionalDouble5.equals((java.lang.Object) optionalDouble27);
        boolean boolean54 = optionalDouble1.equals((java.lang.Object) boolean53);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(optionalDouble5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble14);
        org.junit.Assert.assertNotNull(doubleStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble27);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "OptionalDouble[1.0]" + "'", str32, "OptionalDouble[1.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertNotNull(optionalDouble36);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0d + "'", double38 == 1.0d);
        org.junit.Assert.assertNotNull(optionalDouble40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(optionalDouble43);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "OptionalDouble[1.0]" + "'", str50, "OptionalDouble[1.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of(32.0d);
        java.util.function.DoubleConsumer doubleConsumer2 = null;
        java.lang.Runnable runnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer2, runnable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1);
        java.util.OptionalDouble optionalDouble3 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream4 = optionalDouble3.stream();
        boolean boolean5 = optionalDouble3.isEmpty();
        boolean boolean7 = optionalDouble3.equals((java.lang.Object) 0.0f);
        boolean boolean8 = optionalDouble3.isEmpty();
        boolean boolean9 = optionalDouble3.isEmpty();
        boolean boolean11 = optionalDouble3.equals((java.lang.Object) '4');
        boolean boolean12 = optionalDouble1.equals((java.lang.Object) '4');
        java.util.function.DoubleSupplier doubleSupplier13 = null;
        double double14 = optionalDouble1.orElseGet(doubleSupplier13);
        boolean boolean15 = optionalDouble1.isEmpty();
        boolean boolean16 = optionalDouble1.isEmpty();
        boolean boolean17 = optionalDouble1.isEmpty();
        java.util.function.DoubleConsumer doubleConsumer18 = null;
        java.lang.Runnable runnable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer18, runnable19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(optionalDouble3);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.function.DoubleConsumer doubleConsumer3 = null;
        optionalDouble0.ifPresent(doubleConsumer3);
        double double6 = optionalDouble0.orElse((double) (-1L));
        java.util.function.DoubleConsumer doubleConsumer7 = null;
        optionalDouble0.ifPresent(doubleConsumer7);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = optionalDouble0.getAsDouble();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.function.DoubleConsumer doubleConsumer3 = null;
        optionalDouble0.ifPresent(doubleConsumer3);
        double double6 = optionalDouble0.orElse((double) (-1L));
        boolean boolean7 = optionalDouble0.isEmpty();
        java.util.function.DoubleConsumer doubleConsumer8 = null;
        optionalDouble0.ifPresent(doubleConsumer8);
        boolean boolean10 = optionalDouble0.isPresent();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10);
        double double2 = optionalDouble1.getAsDouble();
        double double4 = optionalDouble1.orElse((double) '#');
        java.util.function.DoubleConsumer doubleConsumer5 = null;
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer5, runnable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean4 = optionalDouble1.isPresent();
        double double5 = optionalDouble1.getAsDouble();
        java.lang.Object obj6 = null;
        boolean boolean7 = optionalDouble1.equals(obj6);
        java.util.stream.DoubleStream doubleStream8 = optionalDouble1.stream();
        boolean boolean9 = optionalDouble1.isEmpty();
        java.lang.Object obj10 = null;
        boolean boolean11 = optionalDouble1.equals(obj10);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        boolean boolean19 = optionalDouble1.isEmpty();
        double double21 = optionalDouble1.orElse((double) (-1L));
        java.util.function.DoubleSupplier doubleSupplier22 = null;
        double double23 = optionalDouble1.orElseGet(doubleSupplier22);
        double double24 = optionalDouble1.orElseThrow();
        boolean boolean26 = optionalDouble1.equals((java.lang.Object) "OptionalDouble.empty");
        java.util.OptionalDouble optionalDouble28 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream29 = optionalDouble28.stream();
        boolean boolean30 = optionalDouble28.isEmpty();
        boolean boolean32 = optionalDouble28.equals((java.lang.Object) 0.0f);
        boolean boolean33 = optionalDouble28.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier34 = null;
        double double35 = optionalDouble28.orElseGet(doubleSupplier34);
        java.util.OptionalDouble optionalDouble37 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream38 = optionalDouble37.stream();
        boolean boolean39 = optionalDouble37.isEmpty();
        boolean boolean41 = optionalDouble37.equals((java.lang.Object) 0.0f);
        boolean boolean42 = optionalDouble37.isEmpty();
        boolean boolean43 = optionalDouble37.isEmpty();
        boolean boolean44 = optionalDouble28.equals((java.lang.Object) optionalDouble37);
        double double45 = optionalDouble28.orElseThrow();
        java.util.function.DoubleSupplier doubleSupplier46 = null;
        double double47 = optionalDouble28.orElseGet(doubleSupplier46);
        java.util.stream.DoubleStream doubleStream48 = optionalDouble28.stream();
        double double50 = optionalDouble28.orElse((double) (byte) -1);
        boolean boolean51 = optionalDouble1.equals((java.lang.Object) double50);
        double double52 = optionalDouble1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(optionalDouble28);
        org.junit.Assert.assertNotNull(doubleStream29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 100.0d + "'", double35 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble37);
        org.junit.Assert.assertNotNull(doubleStream38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 100.0d + "'", double45 == 100.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 100.0d + "'", double47 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream48);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 100.0d + "'", double50 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 100.0d + "'", double52 == 100.0d);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        boolean boolean2 = optionalDouble0.equals((java.lang.Object) '#');
        java.util.OptionalDouble optionalDouble4 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream5 = optionalDouble4.stream();
        boolean boolean6 = optionalDouble4.isEmpty();
        boolean boolean8 = optionalDouble4.equals((java.lang.Object) 0.0f);
        boolean boolean9 = optionalDouble4.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble4.orElseGet(doubleSupplier10);
        java.util.OptionalDouble optionalDouble13 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream14 = optionalDouble13.stream();
        boolean boolean15 = optionalDouble13.isEmpty();
        boolean boolean17 = optionalDouble13.equals((java.lang.Object) 0.0f);
        boolean boolean18 = optionalDouble13.isEmpty();
        boolean boolean19 = optionalDouble13.isEmpty();
        boolean boolean20 = optionalDouble4.equals((java.lang.Object) optionalDouble13);
        double double21 = optionalDouble4.orElseThrow();
        boolean boolean22 = optionalDouble4.isEmpty();
        java.util.stream.DoubleStream doubleStream23 = optionalDouble4.stream();
        boolean boolean24 = optionalDouble0.equals((java.lang.Object) optionalDouble4);
        java.util.OptionalDouble optionalDouble26 = java.util.OptionalDouble.of(0.0d);
        double double27 = optionalDouble26.getAsDouble();
        boolean boolean28 = optionalDouble26.isPresent();
        boolean boolean29 = optionalDouble4.equals((java.lang.Object) boolean28);
        java.util.OptionalDouble optionalDouble31 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream32 = optionalDouble31.stream();
        boolean boolean33 = optionalDouble31.isEmpty();
        boolean boolean34 = optionalDouble31.isPresent();
        double double35 = optionalDouble31.getAsDouble();
        java.lang.Object obj36 = null;
        boolean boolean37 = optionalDouble31.equals(obj36);
        java.util.stream.DoubleStream doubleStream38 = optionalDouble31.stream();
        boolean boolean39 = optionalDouble4.equals((java.lang.Object) doubleStream38);
        java.util.stream.DoubleStream doubleStream40 = optionalDouble4.stream();
        java.util.stream.DoubleStream doubleStream41 = optionalDouble4.stream();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionalDouble4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble13);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(optionalDouble26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(optionalDouble31);
        org.junit.Assert.assertNotNull(doubleStream32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 100.0d + "'", double35 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(doubleStream38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(doubleStream40);
        org.junit.Assert.assertNotNull(doubleStream41);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10);
        double double3 = optionalDouble1.orElse((double) (-1));
        double double4 = optionalDouble1.orElseThrow();
        java.util.function.DoubleSupplier doubleSupplier5 = null;
        double double6 = optionalDouble1.orElseGet(doubleSupplier5);
        java.util.function.DoubleConsumer doubleConsumer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1L);
        double double3 = optionalDouble1.orElse((double) (short) 100);
        java.util.OptionalDouble optionalDouble5 = java.util.OptionalDouble.of((double) 1L);
        boolean boolean6 = optionalDouble1.equals((java.lang.Object) optionalDouble5);
        double double7 = optionalDouble1.getAsDouble();
        java.util.stream.DoubleStream doubleStream8 = optionalDouble1.stream();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(optionalDouble5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleStream8);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) '4');
        double double2 = optionalDouble1.getAsDouble();
        java.util.stream.DoubleStream doubleStream3 = optionalDouble1.stream();
        java.lang.String str4 = optionalDouble1.toString();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalDouble[52.0]" + "'", str4, "OptionalDouble[52.0]");
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10.0f);
        java.util.OptionalDouble optionalDouble3 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream4 = optionalDouble3.stream();
        boolean boolean5 = optionalDouble3.isEmpty();
        boolean boolean6 = optionalDouble3.isPresent();
        java.util.stream.DoubleStream doubleStream7 = optionalDouble3.stream();
        boolean boolean8 = optionalDouble3.isEmpty();
        boolean boolean9 = optionalDouble1.equals((java.lang.Object) boolean8);
        double double11 = optionalDouble1.orElse(0.0d);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(optionalDouble3);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of(0.0d);
        double double2 = optionalDouble1.getAsDouble();
        java.lang.String str3 = optionalDouble1.toString();
        java.util.stream.DoubleStream doubleStream4 = optionalDouble1.stream();
        java.util.function.DoubleConsumer doubleConsumer5 = null;
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer5, runnable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalDouble[0.0]" + "'", str3, "OptionalDouble[0.0]");
        org.junit.Assert.assertNotNull(doubleStream4);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalDouble1.toString();
        double double6 = optionalDouble1.getAsDouble();
        double double8 = optionalDouble1.orElse((double) (short) 10);
        double double10 = optionalDouble1.orElse((double) (short) 0);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble1.stream();
        boolean boolean12 = optionalDouble1.isPresent();
        boolean boolean13 = optionalDouble1.isPresent();
        java.lang.Class<?> wildcardClass14 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalDouble[100.0]" + "'", str5, "OptionalDouble[100.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        boolean boolean18 = optionalDouble1.isPresent();
        java.util.function.DoubleConsumer doubleConsumer19 = null;
        java.lang.Runnable runnable20 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer19, runnable20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 10);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        java.util.stream.DoubleStream doubleStream3 = optionalDouble1.stream();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) (byte) 10);
        double double6 = optionalDouble1.orElseThrow();
        boolean boolean7 = optionalDouble1.isPresent();
        double double8 = optionalDouble1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        boolean boolean1 = optionalDouble0.isPresent();
        java.util.OptionalDouble optionalDouble3 = java.util.OptionalDouble.of((double) 10);
        double double4 = optionalDouble3.getAsDouble();
        boolean boolean5 = optionalDouble0.equals((java.lang.Object) double4);
        java.util.function.DoubleConsumer doubleConsumer6 = null;
        optionalDouble0.ifPresent(doubleConsumer6);
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(optionalDouble3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        double double5 = optionalDouble1.orElse((double) 'a');
        java.lang.String str6 = optionalDouble1.toString();
        boolean boolean7 = optionalDouble1.isPresent();
        boolean boolean8 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier9 = null;
        double double10 = optionalDouble1.orElseGet(doubleSupplier9);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalDouble[1.0]" + "'", str6, "OptionalDouble[1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        java.util.function.DoubleSupplier doubleSupplier3 = null;
        double double4 = optionalDouble1.orElseGet(doubleSupplier3);
        boolean boolean5 = optionalDouble1.isPresent();
        double double7 = optionalDouble1.orElse((double) (byte) -1);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10L);
        java.lang.String str2 = optionalDouble1.toString();
        double double3 = optionalDouble1.getAsDouble();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalDouble[10.0]" + "'", str2, "OptionalDouble[10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10);
        java.lang.String str2 = optionalDouble1.toString();
        double double3 = optionalDouble1.getAsDouble();
        java.lang.String str4 = optionalDouble1.toString();
        boolean boolean5 = optionalDouble1.isPresent();
        java.lang.String str6 = optionalDouble1.toString();
        java.util.function.DoubleConsumer doubleConsumer7 = null;
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer7, runnable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalDouble[10.0]" + "'", str2, "OptionalDouble[10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalDouble[10.0]" + "'", str4, "OptionalDouble[10.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalDouble[10.0]" + "'", str6, "OptionalDouble[10.0]");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.lang.String str1 = optionalDouble0.toString();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.OptionalDouble optionalDouble4 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream5 = optionalDouble4.stream();
        boolean boolean6 = optionalDouble4.isEmpty();
        double double7 = optionalDouble4.orElseThrow();
        boolean boolean8 = optionalDouble0.equals((java.lang.Object) double7);
        java.util.stream.DoubleStream doubleStream9 = optionalDouble0.stream();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "OptionalDouble.empty" + "'", str1, "OptionalDouble.empty");
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(optionalDouble4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleStream9);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        boolean boolean19 = optionalDouble1.isEmpty();
        double double21 = optionalDouble1.orElse((double) (-1L));
        java.lang.Object obj22 = null;
        boolean boolean23 = optionalDouble1.equals(obj22);
        java.util.OptionalDouble optionalDouble25 = java.util.OptionalDouble.of((double) 100L);
        double double26 = optionalDouble25.getAsDouble();
        boolean boolean28 = optionalDouble25.equals((java.lang.Object) (-1));
        java.util.function.DoubleSupplier doubleSupplier29 = null;
        double double30 = optionalDouble25.orElseGet(doubleSupplier29);
        boolean boolean31 = optionalDouble25.isPresent();
        double double32 = optionalDouble25.getAsDouble();
        boolean boolean33 = optionalDouble1.equals((java.lang.Object) optionalDouble25);
        java.util.function.DoubleConsumer doubleConsumer34 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(optionalDouble25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        boolean boolean19 = optionalDouble1.isEmpty();
        java.util.stream.DoubleStream doubleStream20 = optionalDouble1.stream();
        double double22 = optionalDouble1.orElse(1.0d);
        java.util.OptionalDouble optionalDouble24 = java.util.OptionalDouble.of((double) (byte) 100);
        boolean boolean25 = optionalDouble24.isEmpty();
        boolean boolean26 = optionalDouble1.equals((java.lang.Object) optionalDouble24);
        java.lang.String str27 = optionalDouble1.toString();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "OptionalDouble[100.0]" + "'", str27, "OptionalDouble[100.0]");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1L);
        double double2 = optionalDouble1.orElseThrow();
        java.lang.String str3 = optionalDouble1.toString();
        boolean boolean4 = optionalDouble1.isPresent();
        java.util.function.DoubleConsumer doubleConsumer5 = null;
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer5, runnable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OptionalDouble[1.0]" + "'", str3, "OptionalDouble[1.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        boolean boolean2 = optionalDouble0.isPresent();
        double double4 = optionalDouble0.orElse(10.0d);
        java.lang.String str5 = optionalDouble0.toString();
        java.lang.String str6 = optionalDouble0.toString();
        java.util.stream.DoubleStream doubleStream7 = optionalDouble0.stream();
        boolean boolean8 = optionalDouble0.isPresent();
        boolean boolean9 = optionalDouble0.isPresent();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalDouble.empty" + "'", str5, "OptionalDouble.empty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalDouble.empty" + "'", str6, "OptionalDouble.empty");
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        boolean boolean7 = optionalDouble1.isEmpty();
        boolean boolean9 = optionalDouble1.equals((java.lang.Object) '4');
        double double10 = optionalDouble1.getAsDouble();
        double double11 = optionalDouble1.getAsDouble();
        java.util.OptionalDouble optionalDouble13 = java.util.OptionalDouble.of(1.0d);
        java.util.stream.DoubleStream doubleStream14 = optionalDouble13.stream();
        double double15 = optionalDouble13.orElseThrow();
        double double16 = optionalDouble13.getAsDouble();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble13);
        java.util.function.DoubleConsumer doubleConsumer18 = null;
        java.lang.Runnable runnable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer18, runnable19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble13);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of(0.0d);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        java.util.stream.DoubleStream doubleStream4 = optionalDouble1.stream();
        double double5 = optionalDouble1.orElseThrow();
        java.util.stream.DoubleStream doubleStream6 = optionalDouble1.stream();
        double double7 = optionalDouble1.orElseThrow();
        double double8 = optionalDouble1.getAsDouble();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 0.0f);
        double double2 = optionalDouble1.orElseThrow();
        java.util.function.DoubleSupplier doubleSupplier3 = null;
        double double4 = optionalDouble1.orElseGet(doubleSupplier3);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.of(0.0d);
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble6.orElseGet(doubleSupplier7);
        java.util.stream.DoubleStream doubleStream9 = optionalDouble6.stream();
        double double10 = optionalDouble6.orElseThrow();
        double double11 = optionalDouble6.orElseThrow();
        boolean boolean12 = optionalDouble1.equals((java.lang.Object) optionalDouble6);
        java.util.OptionalDouble optionalDouble13 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream14 = optionalDouble13.stream();
        java.util.stream.DoubleStream doubleStream15 = optionalDouble13.stream();
        java.util.stream.DoubleStream doubleStream16 = optionalDouble13.stream();
        java.util.OptionalDouble optionalDouble18 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream19 = optionalDouble18.stream();
        boolean boolean20 = optionalDouble18.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier21 = null;
        double double22 = optionalDouble18.orElseGet(doubleSupplier21);
        java.util.OptionalDouble optionalDouble23 = java.util.OptionalDouble.empty();
        boolean boolean24 = optionalDouble18.equals((java.lang.Object) optionalDouble23);
        java.util.function.DoubleSupplier doubleSupplier25 = null;
        double double26 = optionalDouble18.orElseGet(doubleSupplier25);
        boolean boolean27 = optionalDouble18.isEmpty();
        boolean boolean28 = optionalDouble13.equals((java.lang.Object) optionalDouble18);
        double double29 = optionalDouble18.getAsDouble();
        boolean boolean30 = optionalDouble18.isEmpty();
        double double32 = optionalDouble18.orElse((-1.0d));
        java.util.stream.DoubleStream doubleStream33 = optionalDouble18.stream();
        boolean boolean34 = optionalDouble1.equals((java.lang.Object) optionalDouble18);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(optionalDouble13);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertNotNull(doubleStream15);
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertNotNull(optionalDouble18);
        org.junit.Assert.assertNotNull(doubleStream19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        double double4 = optionalDouble0.orElse((double) 100.0f);
        java.util.OptionalDouble optionalDouble5 = java.util.OptionalDouble.empty();
        boolean boolean7 = optionalDouble5.equals((java.lang.Object) '#');
        java.util.OptionalDouble optionalDouble9 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream10 = optionalDouble9.stream();
        boolean boolean11 = optionalDouble9.isEmpty();
        boolean boolean13 = optionalDouble9.equals((java.lang.Object) 0.0f);
        boolean boolean14 = optionalDouble9.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier15 = null;
        double double16 = optionalDouble9.orElseGet(doubleSupplier15);
        java.util.OptionalDouble optionalDouble18 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream19 = optionalDouble18.stream();
        boolean boolean20 = optionalDouble18.isEmpty();
        boolean boolean22 = optionalDouble18.equals((java.lang.Object) 0.0f);
        boolean boolean23 = optionalDouble18.isEmpty();
        boolean boolean24 = optionalDouble18.isEmpty();
        boolean boolean25 = optionalDouble9.equals((java.lang.Object) optionalDouble18);
        double double26 = optionalDouble9.orElseThrow();
        boolean boolean27 = optionalDouble9.isEmpty();
        java.util.stream.DoubleStream doubleStream28 = optionalDouble9.stream();
        boolean boolean29 = optionalDouble5.equals((java.lang.Object) optionalDouble9);
        boolean boolean30 = optionalDouble5.isEmpty();
        boolean boolean31 = optionalDouble5.isPresent();
        boolean boolean32 = optionalDouble0.equals((java.lang.Object) optionalDouble5);
        java.util.stream.DoubleStream doubleStream33 = optionalDouble5.stream();
        java.util.function.DoubleConsumer doubleConsumer34 = null;
        optionalDouble5.ifPresent(doubleConsumer34);
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalDouble9);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble18);
        org.junit.Assert.assertNotNull(doubleStream19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(doubleStream28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(doubleStream33);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalDouble1.toString();
        double double6 = optionalDouble1.getAsDouble();
        boolean boolean7 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier8 = null;
        double double9 = optionalDouble1.orElseGet(doubleSupplier8);
        boolean boolean10 = optionalDouble1.isEmpty();
        double double11 = optionalDouble1.getAsDouble();
        java.util.function.DoubleSupplier doubleSupplier12 = null;
        double double13 = optionalDouble1.orElseGet(doubleSupplier12);
        java.util.function.DoubleConsumer doubleConsumer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalDouble[100.0]" + "'", str5, "OptionalDouble[100.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 10);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.util.OptionalDouble optionalDouble5 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream6 = optionalDouble5.stream();
        boolean boolean7 = optionalDouble5.isEmpty();
        double double8 = optionalDouble5.orElseThrow();
        java.lang.String str9 = optionalDouble5.toString();
        boolean boolean10 = optionalDouble1.equals((java.lang.Object) str9);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(optionalDouble5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OptionalDouble[100.0]" + "'", str9, "OptionalDouble[100.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) (byte) 0);
        boolean boolean2 = optionalDouble1.isEmpty();
        double double4 = optionalDouble1.orElse((double) (short) 100);
        boolean boolean5 = optionalDouble1.isPresent();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of(10.0d);
        java.lang.String str2 = optionalDouble1.toString();
        double double3 = optionalDouble1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OptionalDouble[10.0]" + "'", str2, "OptionalDouble[10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.empty();
        boolean boolean7 = optionalDouble1.equals((java.lang.Object) optionalDouble6);
        java.util.function.DoubleSupplier doubleSupplier8 = null;
        double double9 = optionalDouble1.orElseGet(doubleSupplier8);
        boolean boolean10 = optionalDouble1.isEmpty();
        double double11 = optionalDouble1.getAsDouble();
        java.util.function.DoubleSupplier doubleSupplier12 = null;
        double double13 = optionalDouble1.orElseGet(doubleSupplier12);
        java.util.stream.DoubleStream doubleStream14 = optionalDouble1.stream();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream14);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.orElseThrow();
        java.util.OptionalDouble optionalDouble4 = java.util.OptionalDouble.of((double) 1L);
        double double6 = optionalDouble4.orElse((double) (short) 100);
        java.util.stream.DoubleStream doubleStream7 = optionalDouble4.stream();
        boolean boolean8 = optionalDouble1.equals((java.lang.Object) optionalDouble4);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) (byte) 10);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        java.util.stream.DoubleStream doubleStream12 = optionalDouble10.stream();
        boolean boolean13 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        boolean boolean14 = optionalDouble10.isEmpty();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        double double4 = optionalDouble0.orElse((double) 100.0f);
        java.util.OptionalDouble optionalDouble5 = java.util.OptionalDouble.empty();
        boolean boolean7 = optionalDouble5.equals((java.lang.Object) '#');
        java.util.OptionalDouble optionalDouble9 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream10 = optionalDouble9.stream();
        boolean boolean11 = optionalDouble9.isEmpty();
        boolean boolean13 = optionalDouble9.equals((java.lang.Object) 0.0f);
        boolean boolean14 = optionalDouble9.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier15 = null;
        double double16 = optionalDouble9.orElseGet(doubleSupplier15);
        java.util.OptionalDouble optionalDouble18 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream19 = optionalDouble18.stream();
        boolean boolean20 = optionalDouble18.isEmpty();
        boolean boolean22 = optionalDouble18.equals((java.lang.Object) 0.0f);
        boolean boolean23 = optionalDouble18.isEmpty();
        boolean boolean24 = optionalDouble18.isEmpty();
        boolean boolean25 = optionalDouble9.equals((java.lang.Object) optionalDouble18);
        double double26 = optionalDouble9.orElseThrow();
        boolean boolean27 = optionalDouble9.isEmpty();
        java.util.stream.DoubleStream doubleStream28 = optionalDouble9.stream();
        boolean boolean29 = optionalDouble5.equals((java.lang.Object) optionalDouble9);
        boolean boolean30 = optionalDouble5.isEmpty();
        boolean boolean31 = optionalDouble5.isPresent();
        boolean boolean32 = optionalDouble0.equals((java.lang.Object) optionalDouble5);
        java.lang.String str33 = optionalDouble0.toString();
        java.util.function.DoubleConsumer doubleConsumer34 = null;
        optionalDouble0.ifPresent(doubleConsumer34);
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalDouble9);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble18);
        org.junit.Assert.assertNotNull(doubleStream19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(doubleStream28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "OptionalDouble.empty" + "'", str33, "OptionalDouble.empty");
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1.0f);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.util.OptionalDouble optionalDouble5 = java.util.OptionalDouble.of((double) (byte) 100);
        double double6 = optionalDouble5.getAsDouble();
        java.util.stream.DoubleStream doubleStream7 = optionalDouble5.stream();
        boolean boolean8 = optionalDouble1.equals((java.lang.Object) optionalDouble5);
        boolean boolean9 = optionalDouble5.isPresent();
        java.util.function.DoubleConsumer doubleConsumer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble5.ifPresent(doubleConsumer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(optionalDouble5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.empty();
        boolean boolean7 = optionalDouble1.equals((java.lang.Object) optionalDouble6);
        java.util.OptionalDouble optionalDouble9 = java.util.OptionalDouble.of(0.0d);
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble9.orElseGet(doubleSupplier10);
        java.util.stream.DoubleStream doubleStream12 = optionalDouble9.stream();
        boolean boolean13 = optionalDouble6.equals((java.lang.Object) doubleStream12);
        java.util.stream.DoubleStream doubleStream14 = optionalDouble6.stream();
        java.util.function.DoubleConsumer doubleConsumer15 = null;
        java.lang.Runnable runnable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble6.ifPresentOrElse(doubleConsumer15, runnable16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Runnable.run()\" because \"emptyAction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalDouble9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(doubleStream14);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.lang.String str1 = optionalDouble0.toString();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.function.DoubleSupplier doubleSupplier3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = optionalDouble0.orElseGet(doubleSupplier3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleSupplier.getAsDouble()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "OptionalDouble.empty" + "'", str1, "OptionalDouble.empty");
        org.junit.Assert.assertNotNull(doubleStream2);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 1);
        java.util.function.DoubleSupplier doubleSupplier11 = null;
        double double12 = optionalDouble10.orElseGet(doubleSupplier11);
        double double14 = optionalDouble10.orElse((double) 'a');
        java.lang.String str15 = optionalDouble10.toString();
        boolean boolean16 = optionalDouble10.isPresent();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        java.lang.Class<?> wildcardClass18 = optionalDouble1.getClass();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "OptionalDouble[1.0]" + "'", str15, "OptionalDouble[1.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        boolean boolean7 = optionalDouble1.isEmpty();
        double double9 = optionalDouble1.orElse((double) 100.0f);
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble1.orElseGet(doubleSupplier10);
        java.lang.String str12 = optionalDouble1.toString();
        java.util.stream.DoubleStream doubleStream13 = optionalDouble1.stream();
        java.lang.String str14 = optionalDouble1.toString();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OptionalDouble[100.0]" + "'", str12, "OptionalDouble[100.0]");
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OptionalDouble[100.0]" + "'", str14, "OptionalDouble[100.0]");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of(0.0d);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        double double5 = optionalDouble1.orElse((double) ' ');
        java.util.function.DoubleSupplier doubleSupplier6 = null;
        double double7 = optionalDouble1.orElseGet(doubleSupplier6);
        double double8 = optionalDouble1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.orElseThrow();
        double double3 = optionalDouble1.orElseThrow();
        double double5 = optionalDouble1.orElse((double) (byte) 0);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        double double20 = optionalDouble1.orElse((double) (byte) 100);
        double double21 = optionalDouble1.orElseThrow();
        boolean boolean22 = optionalDouble1.isPresent();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        java.lang.String str4 = optionalDouble1.toString();
        double double6 = optionalDouble1.orElse((double) 100.0f);
        double double8 = optionalDouble1.orElse((double) (short) 10);
        double double9 = optionalDouble1.getAsDouble();
        boolean boolean10 = optionalDouble1.isEmpty();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OptionalDouble[1.0]" + "'", str4, "OptionalDouble[1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        double double4 = optionalDouble1.orElseThrow();
        double double5 = optionalDouble1.orElseThrow();
        double double6 = optionalDouble1.getAsDouble();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalDouble1.toString();
        double double6 = optionalDouble1.getAsDouble();
        double double8 = optionalDouble1.orElse((double) (short) 10);
        java.util.function.DoubleSupplier doubleSupplier9 = null;
        double double10 = optionalDouble1.orElseGet(doubleSupplier9);
        boolean boolean11 = optionalDouble1.isPresent();
        java.util.function.DoubleConsumer doubleConsumer12 = null;
        java.lang.Runnable runnable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresentOrElse(doubleConsumer12, runnable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalDouble[100.0]" + "'", str5, "OptionalDouble[100.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        java.util.stream.DoubleStream doubleStream4 = optionalDouble1.stream();
        boolean boolean5 = optionalDouble1.isPresent();
        java.util.stream.DoubleStream doubleStream6 = optionalDouble1.stream();
        java.util.function.DoubleConsumer doubleConsumer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble1.ifPresent(doubleConsumer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 1);
        java.util.function.DoubleSupplier doubleSupplier2 = null;
        double double3 = optionalDouble1.orElseGet(doubleSupplier2);
        double double4 = optionalDouble1.orElseThrow();
        java.util.stream.DoubleStream doubleStream5 = optionalDouble1.stream();
        boolean boolean6 = optionalDouble1.isPresent();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.function.DoubleConsumer doubleConsumer3 = null;
        optionalDouble0.ifPresent(doubleConsumer3);
        boolean boolean5 = optionalDouble0.isEmpty();
        boolean boolean6 = optionalDouble0.isPresent();
        boolean boolean7 = optionalDouble0.isEmpty();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        boolean boolean2 = optionalDouble0.equals((java.lang.Object) '#');
        java.util.OptionalDouble optionalDouble4 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream5 = optionalDouble4.stream();
        boolean boolean6 = optionalDouble4.isEmpty();
        boolean boolean8 = optionalDouble4.equals((java.lang.Object) 0.0f);
        boolean boolean9 = optionalDouble4.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble4.orElseGet(doubleSupplier10);
        java.util.OptionalDouble optionalDouble13 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream14 = optionalDouble13.stream();
        boolean boolean15 = optionalDouble13.isEmpty();
        boolean boolean17 = optionalDouble13.equals((java.lang.Object) 0.0f);
        boolean boolean18 = optionalDouble13.isEmpty();
        boolean boolean19 = optionalDouble13.isEmpty();
        boolean boolean20 = optionalDouble4.equals((java.lang.Object) optionalDouble13);
        double double21 = optionalDouble4.orElseThrow();
        boolean boolean22 = optionalDouble4.isEmpty();
        java.util.stream.DoubleStream doubleStream23 = optionalDouble4.stream();
        boolean boolean24 = optionalDouble0.equals((java.lang.Object) optionalDouble4);
        java.util.OptionalDouble optionalDouble26 = java.util.OptionalDouble.of(0.0d);
        double double27 = optionalDouble26.getAsDouble();
        boolean boolean28 = optionalDouble26.isPresent();
        boolean boolean29 = optionalDouble4.equals((java.lang.Object) boolean28);
        java.util.OptionalDouble optionalDouble31 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream32 = optionalDouble31.stream();
        boolean boolean33 = optionalDouble31.isEmpty();
        boolean boolean35 = optionalDouble31.equals((java.lang.Object) 0.0f);
        boolean boolean36 = optionalDouble31.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier37 = null;
        double double38 = optionalDouble31.orElseGet(doubleSupplier37);
        java.util.OptionalDouble optionalDouble40 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream41 = optionalDouble40.stream();
        boolean boolean42 = optionalDouble40.isEmpty();
        boolean boolean44 = optionalDouble40.equals((java.lang.Object) 0.0f);
        boolean boolean45 = optionalDouble40.isEmpty();
        boolean boolean46 = optionalDouble40.isEmpty();
        boolean boolean47 = optionalDouble31.equals((java.lang.Object) optionalDouble40);
        boolean boolean48 = optionalDouble4.equals((java.lang.Object) optionalDouble31);
        java.lang.String str49 = optionalDouble4.toString();
        java.util.function.DoubleConsumer doubleConsumer50 = null;
        java.lang.Runnable runnable51 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble4.ifPresentOrElse(doubleConsumer50, runnable51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionalDouble4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble13);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(optionalDouble26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(optionalDouble31);
        org.junit.Assert.assertNotNull(doubleStream32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble40);
        org.junit.Assert.assertNotNull(doubleStream41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "OptionalDouble[100.0]" + "'", str49, "OptionalDouble[100.0]");
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        boolean boolean7 = optionalDouble1.isEmpty();
        double double9 = optionalDouble1.orElse((double) 100.0f);
        double double11 = optionalDouble1.orElse(0.0d);
        java.util.stream.DoubleStream doubleStream12 = optionalDouble1.stream();
        java.util.function.DoubleSupplier doubleSupplier13 = null;
        double double14 = optionalDouble1.orElseGet(doubleSupplier13);
        double double16 = optionalDouble1.orElse((double) '4');
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream3 = optionalDouble0.stream();
        java.util.OptionalDouble optionalDouble5 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream6 = optionalDouble5.stream();
        boolean boolean7 = optionalDouble5.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier8 = null;
        double double9 = optionalDouble5.orElseGet(doubleSupplier8);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.empty();
        boolean boolean11 = optionalDouble5.equals((java.lang.Object) optionalDouble10);
        java.util.function.DoubleSupplier doubleSupplier12 = null;
        double double13 = optionalDouble5.orElseGet(doubleSupplier12);
        boolean boolean14 = optionalDouble5.isEmpty();
        boolean boolean15 = optionalDouble0.equals((java.lang.Object) optionalDouble5);
        java.lang.String str16 = optionalDouble0.toString();
        boolean boolean17 = optionalDouble0.isEmpty();
        boolean boolean18 = optionalDouble0.isEmpty();
        java.lang.Class<?> wildcardClass19 = optionalDouble0.getClass();
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(optionalDouble5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OptionalDouble.empty" + "'", str16, "OptionalDouble.empty");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalDouble1.toString();
        double double6 = optionalDouble1.getAsDouble();
        double double8 = optionalDouble1.orElse((double) (short) 10);
        double double10 = optionalDouble1.orElse((double) (short) 0);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble1.stream();
        double double12 = optionalDouble1.getAsDouble();
        boolean boolean13 = optionalDouble1.isEmpty();
        java.lang.String str14 = optionalDouble1.toString();
        double double15 = optionalDouble1.getAsDouble();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalDouble[100.0]" + "'", str5, "OptionalDouble[100.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OptionalDouble[100.0]" + "'", str14, "OptionalDouble[100.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        double double4 = optionalDouble1.getAsDouble();
        boolean boolean5 = optionalDouble1.isPresent();
        java.util.function.DoubleSupplier doubleSupplier6 = null;
        double double7 = optionalDouble1.orElseGet(doubleSupplier6);
        boolean boolean8 = optionalDouble1.isPresent();
        boolean boolean9 = optionalDouble1.isPresent();
        double double10 = optionalDouble1.orElseThrow();
        double double11 = optionalDouble1.orElseThrow();
        double double12 = optionalDouble1.getAsDouble();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        boolean boolean7 = optionalDouble1.isEmpty();
        boolean boolean9 = optionalDouble1.equals((java.lang.Object) '4');
        double double10 = optionalDouble1.getAsDouble();
        double double11 = optionalDouble1.getAsDouble();
        double double12 = optionalDouble1.getAsDouble();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream3 = optionalDouble0.stream();
        java.util.OptionalDouble optionalDouble5 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream6 = optionalDouble5.stream();
        boolean boolean7 = optionalDouble5.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier8 = null;
        double double9 = optionalDouble5.orElseGet(doubleSupplier8);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.empty();
        boolean boolean11 = optionalDouble5.equals((java.lang.Object) optionalDouble10);
        java.util.function.DoubleSupplier doubleSupplier12 = null;
        double double13 = optionalDouble5.orElseGet(doubleSupplier12);
        boolean boolean14 = optionalDouble5.isEmpty();
        boolean boolean15 = optionalDouble0.equals((java.lang.Object) optionalDouble5);
        java.lang.String str16 = optionalDouble0.toString();
        boolean boolean17 = optionalDouble0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = optionalDouble0.getAsDouble();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(optionalDouble5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OptionalDouble.empty" + "'", str16, "OptionalDouble.empty");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.stream.DoubleStream doubleStream7 = optionalDouble1.stream();
        boolean boolean8 = optionalDouble1.isEmpty();
        double double9 = optionalDouble1.getAsDouble();
        double double10 = optionalDouble1.getAsDouble();
        java.util.OptionalDouble optionalDouble12 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream13 = optionalDouble12.stream();
        boolean boolean14 = optionalDouble12.isEmpty();
        boolean boolean16 = optionalDouble12.equals((java.lang.Object) 0.0f);
        boolean boolean17 = optionalDouble12.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier18 = null;
        double double19 = optionalDouble12.orElseGet(doubleSupplier18);
        java.util.OptionalDouble optionalDouble21 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream22 = optionalDouble21.stream();
        boolean boolean23 = optionalDouble21.isEmpty();
        boolean boolean25 = optionalDouble21.equals((java.lang.Object) 0.0f);
        boolean boolean26 = optionalDouble21.isEmpty();
        boolean boolean27 = optionalDouble21.isEmpty();
        boolean boolean28 = optionalDouble12.equals((java.lang.Object) optionalDouble21);
        double double29 = optionalDouble12.orElseThrow();
        java.util.function.DoubleSupplier doubleSupplier30 = null;
        double double31 = optionalDouble12.orElseGet(doubleSupplier30);
        double double33 = optionalDouble12.orElse((double) (-1));
        boolean boolean34 = optionalDouble1.equals((java.lang.Object) (-1));
        java.util.OptionalDouble optionalDouble36 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream37 = optionalDouble36.stream();
        boolean boolean38 = optionalDouble36.isEmpty();
        boolean boolean40 = optionalDouble36.equals((java.lang.Object) 0.0f);
        boolean boolean41 = optionalDouble36.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier42 = null;
        double double43 = optionalDouble36.orElseGet(doubleSupplier42);
        double double44 = optionalDouble36.orElseThrow();
        double double45 = optionalDouble36.getAsDouble();
        java.util.stream.DoubleStream doubleStream46 = optionalDouble36.stream();
        boolean boolean47 = optionalDouble1.equals((java.lang.Object) optionalDouble36);
        java.util.function.DoubleConsumer doubleConsumer48 = null;
        java.lang.Runnable runnable49 = null;
        // The following exception was thrown during execution in test generation
        try {
            optionalDouble36.ifPresentOrElse(doubleConsumer48, runnable49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleConsumer.accept(double)\" because \"action\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble12);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble21);
        org.junit.Assert.assertNotNull(doubleStream22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 100.0d + "'", double33 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(optionalDouble36);
        org.junit.Assert.assertNotNull(doubleStream37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 100.0d + "'", double43 == 100.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 100.0d + "'", double44 == 100.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 100.0d + "'", double45 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        double double9 = optionalDouble1.orElseThrow();
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isPresent();
        boolean boolean13 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        java.lang.String str14 = optionalDouble10.toString();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OptionalDouble.empty" + "'", str14, "OptionalDouble.empty");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.empty();
        boolean boolean7 = optionalDouble1.equals((java.lang.Object) optionalDouble6);
        java.util.OptionalDouble optionalDouble9 = java.util.OptionalDouble.of(0.0d);
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble9.orElseGet(doubleSupplier10);
        java.util.stream.DoubleStream doubleStream12 = optionalDouble9.stream();
        boolean boolean13 = optionalDouble6.equals((java.lang.Object) doubleStream12);
        boolean boolean14 = optionalDouble6.isEmpty();
        boolean boolean15 = optionalDouble6.isEmpty();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalDouble9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 10);
        double double3 = optionalDouble1.orElse((double) (-1));
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        boolean boolean2 = optionalDouble1.isPresent();
        boolean boolean3 = optionalDouble1.isEmpty();
        double double5 = optionalDouble1.orElse((double) (-1L));
        java.util.stream.DoubleStream doubleStream6 = optionalDouble1.stream();
        boolean boolean7 = optionalDouble1.isPresent();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        boolean boolean2 = optionalDouble1.isPresent();
        boolean boolean3 = optionalDouble1.isEmpty();
        double double5 = optionalDouble1.orElse((double) (-1.0f));
        java.lang.String str6 = optionalDouble1.toString();
        double double7 = optionalDouble1.orElseThrow();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OptionalDouble[100.0]" + "'", str6, "OptionalDouble[100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean5 = optionalDouble1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream11 = optionalDouble10.stream();
        boolean boolean12 = optionalDouble10.isEmpty();
        boolean boolean14 = optionalDouble10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = optionalDouble10.isEmpty();
        boolean boolean16 = optionalDouble10.isEmpty();
        boolean boolean17 = optionalDouble1.equals((java.lang.Object) optionalDouble10);
        double double18 = optionalDouble1.orElseThrow();
        boolean boolean19 = optionalDouble1.isEmpty();
        double double21 = optionalDouble1.orElse((double) (-1L));
        java.util.function.DoubleSupplier doubleSupplier22 = null;
        double double23 = optionalDouble1.orElseGet(doubleSupplier22);
        double double24 = optionalDouble1.orElseThrow();
        boolean boolean25 = optionalDouble1.isEmpty();
        java.util.OptionalDouble optionalDouble27 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream28 = optionalDouble27.stream();
        boolean boolean29 = optionalDouble27.isEmpty();
        double double30 = optionalDouble27.orElseThrow();
        java.lang.String str31 = optionalDouble27.toString();
        java.util.stream.DoubleStream doubleStream32 = optionalDouble27.stream();
        boolean boolean33 = optionalDouble1.equals((java.lang.Object) doubleStream32);
        double double34 = optionalDouble1.getAsDouble();
        java.lang.String str35 = optionalDouble1.toString();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(optionalDouble27);
        org.junit.Assert.assertNotNull(doubleStream28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "OptionalDouble[100.0]" + "'", str31, "OptionalDouble[100.0]");
        org.junit.Assert.assertNotNull(doubleStream32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "OptionalDouble[100.0]" + "'", str35, "OptionalDouble[100.0]");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.empty();
        boolean boolean7 = optionalDouble1.equals((java.lang.Object) optionalDouble6);
        java.util.OptionalDouble optionalDouble9 = java.util.OptionalDouble.of(0.0d);
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble9.orElseGet(doubleSupplier10);
        java.util.stream.DoubleStream doubleStream12 = optionalDouble9.stream();
        boolean boolean13 = optionalDouble6.equals((java.lang.Object) doubleStream12);
        java.util.stream.DoubleStream doubleStream14 = optionalDouble6.stream();
        boolean boolean15 = optionalDouble6.isEmpty();
        java.lang.String str16 = optionalDouble6.toString();
        java.util.OptionalDouble optionalDouble18 = java.util.OptionalDouble.of(0.0d);
        java.util.function.DoubleSupplier doubleSupplier19 = null;
        double double20 = optionalDouble18.orElseGet(doubleSupplier19);
        java.util.stream.DoubleStream doubleStream21 = optionalDouble18.stream();
        java.util.stream.DoubleStream doubleStream22 = optionalDouble18.stream();
        java.util.function.DoubleSupplier doubleSupplier23 = null;
        double double24 = optionalDouble18.orElseGet(doubleSupplier23);
        boolean boolean25 = optionalDouble6.equals((java.lang.Object) double24);
        boolean boolean26 = optionalDouble6.isPresent();
        // The following exception was thrown during execution in test generation
        try {
            double double27 = optionalDouble6.orElseThrow();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionalDouble9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OptionalDouble.empty" + "'", str16, "OptionalDouble.empty");
        org.junit.Assert.assertNotNull(optionalDouble18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(doubleStream21);
        org.junit.Assert.assertNotNull(doubleStream22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.orElseThrow();
        java.util.OptionalDouble optionalDouble4 = java.util.OptionalDouble.of((double) 1L);
        double double6 = optionalDouble4.orElse((double) (short) 100);
        java.util.stream.DoubleStream doubleStream7 = optionalDouble4.stream();
        boolean boolean8 = optionalDouble1.equals((java.lang.Object) optionalDouble4);
        double double10 = optionalDouble1.orElse((double) ' ');
        boolean boolean11 = optionalDouble1.isPresent();
        java.lang.String str12 = optionalDouble1.toString();
        java.lang.String str13 = optionalDouble1.toString();
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OptionalDouble[100.0]" + "'", str12, "OptionalDouble[100.0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OptionalDouble[100.0]" + "'", str13, "OptionalDouble[100.0]");
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        boolean boolean4 = optionalDouble1.isPresent();
        double double5 = optionalDouble1.getAsDouble();
        double double6 = optionalDouble1.orElseThrow();
        java.util.function.DoubleSupplier doubleSupplier7 = null;
        double double8 = optionalDouble1.orElseGet(doubleSupplier7);
        boolean boolean9 = optionalDouble1.isEmpty();
        java.util.stream.DoubleStream doubleStream10 = optionalDouble1.stream();
        java.util.stream.DoubleStream doubleStream11 = optionalDouble1.stream();
        double double12 = optionalDouble1.getAsDouble();
        java.util.function.DoubleSupplier doubleSupplier13 = null;
        double double14 = optionalDouble1.orElseGet(doubleSupplier13);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        double double2 = optionalDouble1.getAsDouble();
        boolean boolean4 = optionalDouble1.equals((java.lang.Object) (-1));
        java.lang.String str5 = optionalDouble1.toString();
        double double6 = optionalDouble1.getAsDouble();
        boolean boolean7 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier8 = null;
        double double9 = optionalDouble1.orElseGet(doubleSupplier8);
        boolean boolean10 = optionalDouble1.isEmpty();
        double double11 = optionalDouble1.getAsDouble();
        java.util.function.DoubleSupplier doubleSupplier12 = null;
        double double13 = optionalDouble1.orElseGet(doubleSupplier12);
        double double15 = optionalDouble1.orElse((double) 0);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OptionalDouble[100.0]" + "'", str5, "OptionalDouble[100.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        boolean boolean2 = optionalDouble0.equals((java.lang.Object) '#');
        java.util.OptionalDouble optionalDouble4 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream5 = optionalDouble4.stream();
        boolean boolean6 = optionalDouble4.isEmpty();
        boolean boolean8 = optionalDouble4.equals((java.lang.Object) 0.0f);
        boolean boolean9 = optionalDouble4.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier10 = null;
        double double11 = optionalDouble4.orElseGet(doubleSupplier10);
        java.util.OptionalDouble optionalDouble13 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream14 = optionalDouble13.stream();
        boolean boolean15 = optionalDouble13.isEmpty();
        boolean boolean17 = optionalDouble13.equals((java.lang.Object) 0.0f);
        boolean boolean18 = optionalDouble13.isEmpty();
        boolean boolean19 = optionalDouble13.isEmpty();
        boolean boolean20 = optionalDouble4.equals((java.lang.Object) optionalDouble13);
        double double21 = optionalDouble4.orElseThrow();
        boolean boolean22 = optionalDouble4.isEmpty();
        java.util.stream.DoubleStream doubleStream23 = optionalDouble4.stream();
        boolean boolean24 = optionalDouble0.equals((java.lang.Object) optionalDouble4);
        java.util.OptionalDouble optionalDouble26 = java.util.OptionalDouble.of(0.0d);
        double double27 = optionalDouble26.getAsDouble();
        boolean boolean28 = optionalDouble26.isPresent();
        boolean boolean29 = optionalDouble4.equals((java.lang.Object) boolean28);
        java.util.function.DoubleSupplier doubleSupplier30 = null;
        double double31 = optionalDouble4.orElseGet(doubleSupplier30);
        java.util.OptionalDouble optionalDouble33 = java.util.OptionalDouble.of((double) 0.0f);
        double double34 = optionalDouble33.orElseThrow();
        java.util.function.DoubleSupplier doubleSupplier35 = null;
        double double36 = optionalDouble33.orElseGet(doubleSupplier35);
        java.util.OptionalDouble optionalDouble38 = java.util.OptionalDouble.of(0.0d);
        java.util.function.DoubleSupplier doubleSupplier39 = null;
        double double40 = optionalDouble38.orElseGet(doubleSupplier39);
        java.util.stream.DoubleStream doubleStream41 = optionalDouble38.stream();
        double double42 = optionalDouble38.orElseThrow();
        double double43 = optionalDouble38.orElseThrow();
        boolean boolean44 = optionalDouble33.equals((java.lang.Object) optionalDouble38);
        boolean boolean45 = optionalDouble4.equals((java.lang.Object) boolean44);
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(optionalDouble4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble13);
        org.junit.Assert.assertNotNull(doubleStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(optionalDouble26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(optionalDouble38);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(doubleStream41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        java.util.OptionalDouble optionalDouble1 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream2 = optionalDouble1.stream();
        boolean boolean3 = optionalDouble1.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        double double5 = optionalDouble1.orElseGet(doubleSupplier4);
        java.util.OptionalDouble optionalDouble6 = java.util.OptionalDouble.empty();
        boolean boolean7 = optionalDouble1.equals((java.lang.Object) optionalDouble6);
        java.util.function.DoubleSupplier doubleSupplier8 = null;
        double double9 = optionalDouble1.orElseGet(doubleSupplier8);
        boolean boolean10 = optionalDouble1.isEmpty();
        double double11 = optionalDouble1.getAsDouble();
        java.util.OptionalDouble optionalDouble13 = java.util.OptionalDouble.of((double) 1);
        java.util.function.DoubleSupplier doubleSupplier14 = null;
        double double15 = optionalDouble13.orElseGet(doubleSupplier14);
        double double17 = optionalDouble13.orElse((double) 'a');
        java.lang.String str18 = optionalDouble13.toString();
        boolean boolean19 = optionalDouble13.isPresent();
        java.util.function.DoubleSupplier doubleSupplier20 = null;
        double double21 = optionalDouble13.orElseGet(doubleSupplier20);
        boolean boolean22 = optionalDouble13.isPresent();
        boolean boolean23 = optionalDouble1.equals((java.lang.Object) boolean22);
        org.junit.Assert.assertNotNull(optionalDouble1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "OptionalDouble[1.0]" + "'", str18, "OptionalDouble[1.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        java.util.OptionalDouble optionalDouble0 = java.util.OptionalDouble.empty();
        java.util.stream.DoubleStream doubleStream1 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream2 = optionalDouble0.stream();
        java.util.stream.DoubleStream doubleStream3 = optionalDouble0.stream();
        java.util.OptionalDouble optionalDouble5 = java.util.OptionalDouble.of((double) 100L);
        java.util.stream.DoubleStream doubleStream6 = optionalDouble5.stream();
        boolean boolean7 = optionalDouble5.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier8 = null;
        double double9 = optionalDouble5.orElseGet(doubleSupplier8);
        java.util.OptionalDouble optionalDouble10 = java.util.OptionalDouble.empty();
        boolean boolean11 = optionalDouble5.equals((java.lang.Object) optionalDouble10);
        java.util.function.DoubleSupplier doubleSupplier12 = null;
        double double13 = optionalDouble5.orElseGet(doubleSupplier12);
        boolean boolean14 = optionalDouble5.isEmpty();
        boolean boolean15 = optionalDouble0.equals((java.lang.Object) optionalDouble5);
        boolean boolean16 = optionalDouble0.isEmpty();
        java.util.stream.DoubleStream doubleStream17 = optionalDouble0.stream();
        boolean boolean18 = optionalDouble0.isEmpty();
        java.util.function.DoubleSupplier doubleSupplier19 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double20 = optionalDouble0.orElseGet(doubleSupplier19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.DoubleSupplier.getAsDouble()\" because \"supplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(optionalDouble0);
        org.junit.Assert.assertNotNull(doubleStream1);
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(optionalDouble5);
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(optionalDouble10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }
}

