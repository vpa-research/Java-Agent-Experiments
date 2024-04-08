package org.huawei.optional;

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
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.orElseThrow();
        java.lang.String str4 = serializableOptional1.toString();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional5 = java.util.Optional.of(serializableOptional1);
        boolean boolean6 = serializableOptional1.isPresent();
        java.io.Serializable serializable7 = serializableOptional1.get();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Optional[1]" + "'", str4, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableOptionalOptional5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean3 = serializableOptional1.isPresent();
        boolean boolean5 = serializableOptional1.equals((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass6 = serializableOptional1.getClass();
        java.util.Optional<java.io.Serializable> serializableOptional7 = java.util.Optional.of((java.io.Serializable) wildcardClass6);
        java.util.Optional<java.io.Serializable> serializableOptional9 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean11 = serializableOptional9.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream12 = serializableOptional9.stream();
        java.io.Serializable serializable13 = serializableOptional9.get();
        boolean boolean14 = serializableOptional7.equals((java.lang.Object) serializableOptional9);
        boolean boolean15 = serializableOptional7.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(serializableOptional7);
        org.junit.Assert.assertNotNull(serializableOptional9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(serializableStream12);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.lang.String str8 = serializableOptional1.toString();
        java.lang.String str9 = serializableOptional1.toString();
        java.lang.String str10 = serializableOptional1.toString();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Optional[1]" + "'", str8, "Optional[1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Optional[1]" + "'", str9, "Optional[1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Optional[1]" + "'", str10, "Optional[1]");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.lang.String str6 = serializableOptional1.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        java.io.Serializable serializable8 = serializableOptional1.orElseThrow();
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional1.stream();
        java.io.Serializable serializable10 = serializableOptional1.get();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        boolean boolean4 = serializableOptional1.equals((java.lang.Object) false);
        java.lang.String str5 = serializableOptional1.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream6 = serializableOptional1.stream();
        java.io.Serializable serializable7 = serializableOptional1.orElseThrow();
        java.lang.String str8 = serializableOptional1.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional1.stream();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Optional[1]" + "'", str5, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream6);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Optional[1]" + "'", str8, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream9);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable5 = serializableOptional1.get();
        boolean boolean6 = serializableOptional1.isPresent();
        java.io.Serializable serializable7 = serializableOptional1.get();
        java.util.Optional<java.io.Serializable> serializableOptional9 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable10 = serializableOptional9.get();
        java.io.Serializable serializable11 = serializableOptional9.get();
        java.io.Serializable serializable12 = serializableOptional9.get();
        boolean boolean13 = serializableOptional9.isPresent();
        boolean boolean14 = serializableOptional1.equals((java.lang.Object) serializableOptional9);
        java.lang.String str15 = serializableOptional1.toString();
        java.io.Serializable serializable16 = serializableOptional1.get();
        java.lang.Class<?> wildcardClass17 = serializableOptional1.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional9);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + (byte) 1 + "'", serializable12, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Optional[1]" + "'", str15, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable16 + "' != '" + (byte) 1 + "'", serializable16, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.lang.String str6 = serializableOptional1.toString();
        java.io.Serializable serializable7 = serializableOptional1.orElseThrow();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + (byte) 1 + "'", serializable7, (byte) 1);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream4 = serializableOptional1.stream();
        java.util.Optional<java.lang.Comparable<java.lang.String>> strComparableOptional5 = java.util.Optional.empty();
        boolean boolean6 = serializableOptional1.equals((java.lang.Object) strComparableOptional5);
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional8.stream();
        java.io.Serializable serializable11 = serializableOptional8.orElse((java.io.Serializable) (short) 100);
        java.util.stream.Stream<java.io.Serializable> serializableStream12 = serializableOptional8.stream();
        boolean boolean13 = serializableOptional1.equals((java.lang.Object) serializableStream12);
        java.util.Optional<java.io.Serializable> serializableOptional15 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream16 = serializableOptional15.stream();
        java.lang.Class<?> wildcardClass17 = serializableStream16.getClass();
        java.util.Optional<java.lang.reflect.Type> typeOptional18 = java.util.Optional.ofNullable((java.lang.reflect.Type) wildcardClass17);
        java.io.Serializable serializable19 = serializableOptional1.orElse((java.io.Serializable) wildcardClass17);
        java.util.Optional<java.lang.reflect.AnnotatedElement> annotatedElementOptional20 = java.util.Optional.of((java.lang.reflect.AnnotatedElement) wildcardClass17);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serializableStream4);
        org.junit.Assert.assertNotNull(strComparableOptional5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + (byte) 1 + "'", serializable11, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(serializableOptional15);
        org.junit.Assert.assertNotNull(serializableStream16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(typeOptional18);
        org.junit.Assert.assertEquals("'" + serializable19 + "' != '" + (byte) 1 + "'", serializable19, (byte) 1);
        org.junit.Assert.assertNotNull(annotatedElementOptional20);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional3 = java.util.Optional.ofNullable(serializableOptional1);
        boolean boolean4 = serializableOptional1.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream5 = serializableOptional1.stream();
        java.io.Serializable serializable6 = serializableOptional1.get();
        boolean boolean7 = serializableOptional1.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertNotNull(serializableOptionalOptional3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(serializableStream5);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        java.util.Optional<java.lang.reflect.Type> typeOptional0 = java.util.Optional.empty();
        org.junit.Assert.assertNotNull(typeOptional0);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.io.Serializable serializable2 = serializableOptional1.get();
        java.io.Serializable serializable3 = serializableOptional1.get();
        java.io.Serializable serializable4 = serializableOptional1.get();
        boolean boolean5 = serializableOptional1.isEmpty();
        java.io.Serializable serializable6 = serializableOptional1.orElseThrow();
        boolean boolean8 = serializableOptional1.equals((java.lang.Object) 100.0d);
        java.io.Serializable serializable9 = serializableOptional1.orElseThrow();
        java.io.Serializable serializable10 = serializableOptional1.get();
        java.util.Optional<java.io.Serializable> serializableOptional12 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean14 = serializableOptional12.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream15 = serializableOptional12.stream();
        boolean boolean16 = serializableOptional1.equals((java.lang.Object) serializableStream15);
        java.util.Optional<java.io.Serializable> serializableOptional18 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.Optional<java.io.Serializable> serializableOptional20 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream21 = serializableOptional20.stream();
        java.lang.Class<?> wildcardClass22 = serializableStream21.getClass();
        java.util.Optional<java.lang.reflect.Type> typeOptional23 = java.util.Optional.ofNullable((java.lang.reflect.Type) wildcardClass22);
        boolean boolean24 = serializableOptional18.equals((java.lang.Object) wildcardClass22);
        java.util.Optional<java.lang.invoke.TypeDescriptor> typeDescriptorOptional25 = java.util.Optional.of((java.lang.invoke.TypeDescriptor) wildcardClass22);
        java.util.Optional<java.lang.constant.Constable> constableOptional26 = java.util.Optional.of((java.lang.constant.Constable) wildcardClass22);
        java.io.Serializable serializable27 = serializableOptional1.orElse((java.io.Serializable) wildcardClass22);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + (byte) 1 + "'", serializable2, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable3 + "' != '" + (byte) 1 + "'", serializable3, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + serializable6 + "' != '" + (byte) 1 + "'", serializable6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable10 + "' != '" + (byte) 1 + "'", serializable10, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(serializableStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(serializableOptional18);
        org.junit.Assert.assertNotNull(serializableOptional20);
        org.junit.Assert.assertNotNull(serializableStream21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(typeOptional23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(typeDescriptorOptional25);
        org.junit.Assert.assertNotNull(constableOptional26);
        org.junit.Assert.assertEquals("'" + serializable27 + "' != '" + (byte) 1 + "'", serializable27, (byte) 1);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<java.lang.Object> objOptional1 = java.util.Optional.of(obj0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (short) 100);
        java.io.Serializable serializable5 = serializableOptional1.get();
        boolean boolean6 = serializableOptional1.isPresent();
        boolean boolean7 = serializableOptional1.isEmpty();
        java.util.Optional<java.io.Serializable> serializableOptional9 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream10 = serializableOptional9.stream();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional11 = java.util.Optional.ofNullable(serializableOptional9);
        java.lang.String str12 = serializableOptional9.toString();
        boolean boolean13 = serializableOptional1.equals((java.lang.Object) str12);
        boolean boolean14 = serializableOptional1.isEmpty();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(serializableOptional9);
        org.junit.Assert.assertNotNull(serializableStream10);
        org.junit.Assert.assertNotNull(serializableOptionalOptional11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Optional[1]" + "'", str12, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream2 = serializableOptional1.stream();
        java.util.Optional<java.util.Optional<java.io.Serializable>> serializableOptionalOptional3 = java.util.Optional.ofNullable(serializableOptional1);
        boolean boolean4 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional6 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional6.stream();
        boolean boolean8 = serializableOptional6.isEmpty();
        java.io.Serializable serializable9 = serializableOptional6.orElseThrow();
        java.util.Optional<java.io.Serializable> serializableOptional11 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean13 = serializableOptional11.equals((java.lang.Object) 10.0f);
        java.util.stream.Stream<java.io.Serializable> serializableStream14 = serializableOptional11.stream();
        java.io.Serializable serializable15 = serializableOptional11.get();
        java.lang.Class<?> wildcardClass16 = serializableOptional11.getClass();
        java.io.Serializable serializable17 = serializableOptional6.orElse((java.io.Serializable) wildcardClass16);
        boolean boolean18 = serializableOptional1.equals((java.lang.Object) wildcardClass16);
        java.util.Optional<java.io.Serializable> serializableOptional20 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream21 = serializableOptional20.stream();
        java.io.Serializable serializable23 = serializableOptional20.orElse((java.io.Serializable) (short) 100);
        java.util.stream.Stream<java.io.Serializable> serializableStream24 = serializableOptional20.stream();
        java.util.Optional<java.util.stream.Stream<java.io.Serializable>> serializableStreamOptional25 = java.util.Optional.ofNullable(serializableStream24);
        java.lang.Class<?> wildcardClass26 = serializableStreamOptional25.getClass();
        java.io.Serializable serializable27 = serializableOptional1.orElse((java.io.Serializable) wildcardClass26);
        boolean boolean28 = serializableOptional1.isPresent();
        java.util.stream.Stream<java.io.Serializable> serializableStream29 = serializableOptional1.stream();
        java.io.Serializable serializable30 = serializableOptional1.orElseThrow();
        boolean boolean31 = serializableOptional1.isEmpty();
        boolean boolean32 = serializableOptional1.isPresent();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertNotNull(serializableStream2);
        org.junit.Assert.assertNotNull(serializableOptionalOptional3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(serializableOptional6);
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9, (byte) 1);
        org.junit.Assert.assertNotNull(serializableOptional11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(serializableStream14);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (byte) 1 + "'", serializable15, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + serializable17 + "' != '" + (byte) 1 + "'", serializable17, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(serializableOptional20);
        org.junit.Assert.assertNotNull(serializableStream21);
        org.junit.Assert.assertEquals("'" + serializable23 + "' != '" + (byte) 1 + "'", serializable23, (byte) 1);
        org.junit.Assert.assertNotNull(serializableStream24);
        org.junit.Assert.assertNotNull(serializableStreamOptional25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertEquals("'" + serializable27 + "' != '" + (byte) 1 + "'", serializable27, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(serializableStream29);
        org.junit.Assert.assertEquals("'" + serializable30 + "' != '" + (byte) 1 + "'", serializable30, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        boolean boolean4 = serializableOptional1.isEmpty();
        java.io.Serializable serializable5 = serializableOptional1.get();
        java.lang.String str6 = serializableOptional1.toString();
        boolean boolean7 = serializableOptional1.isPresent();
        java.lang.Class<?> wildcardClass8 = serializableOptional1.getClass();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean3 = serializableOptional1.equals((java.lang.Object) 10.0f);
        java.io.Serializable serializable5 = serializableOptional1.orElse((java.io.Serializable) '#');
        java.lang.String str6 = serializableOptional1.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream7 = serializableOptional1.stream();
        boolean boolean8 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional10 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream11 = serializableOptional10.stream();
        boolean boolean12 = serializableOptional10.isEmpty();
        java.io.Serializable serializable13 = serializableOptional10.orElseThrow();
        boolean boolean14 = serializableOptional10.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional16 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean17 = serializableOptional16.isPresent();
        java.io.Serializable serializable18 = serializableOptional16.orElseThrow();
        java.io.Serializable serializable19 = serializableOptional16.orElseThrow();
        boolean boolean20 = serializableOptional16.isEmpty();
        boolean boolean21 = serializableOptional10.equals((java.lang.Object) serializableOptional16);
        java.lang.Class<?> wildcardClass22 = serializableOptional16.getClass();
        java.util.Optional<java.lang.invoke.TypeDescriptor> typeDescriptorOptional23 = java.util.Optional.of((java.lang.invoke.TypeDescriptor) wildcardClass22);
        java.io.Serializable serializable24 = serializableOptional1.orElse((java.io.Serializable) wildcardClass22);
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + (byte) 1 + "'", serializable5, (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Optional[1]" + "'", str6, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(serializableOptional10);
        org.junit.Assert.assertNotNull(serializableStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + serializable13 + "' != '" + (byte) 1 + "'", serializable13, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(serializableOptional16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + serializable18 + "' != '" + (byte) 1 + "'", serializable18, (byte) 1);
        org.junit.Assert.assertEquals("'" + serializable19 + "' != '" + (byte) 1 + "'", serializable19, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(typeDescriptorOptional23);
        org.junit.Assert.assertEquals("'" + serializable24 + "' != '" + (byte) 1 + "'", serializable24, (byte) 1);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        java.util.Optional<java.io.Serializable> serializableOptional1 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        boolean boolean2 = serializableOptional1.isPresent();
        java.io.Serializable serializable4 = serializableOptional1.orElse((java.io.Serializable) (byte) 10);
        boolean boolean5 = serializableOptional1.isPresent();
        boolean boolean6 = serializableOptional1.isPresent();
        java.util.Optional<java.io.Serializable> serializableOptional8 = java.util.Optional.of((java.io.Serializable) (byte) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableOptional8.stream();
        boolean boolean11 = serializableOptional8.equals((java.lang.Object) false);
        java.lang.String str12 = serializableOptional8.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream13 = serializableOptional8.stream();
        boolean boolean14 = serializableOptional1.equals((java.lang.Object) serializableOptional8);
        java.io.Serializable serializable15 = serializableOptional8.orElseThrow();
        boolean boolean16 = serializableOptional8.isPresent();
        org.junit.Assert.assertNotNull(serializableOptional1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + (byte) 1 + "'", serializable4, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableOptional8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Optional[1]" + "'", str12, "Optional[1]");
        org.junit.Assert.assertNotNull(serializableStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + serializable15 + "' != '" + (byte) 1 + "'", serializable15, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }
}

