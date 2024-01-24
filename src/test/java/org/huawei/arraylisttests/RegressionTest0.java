package org.huawei.arraylisttests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.constant.ConstantDesc[] constantDescArray5 = new java.lang.constant.ConstantDesc[] { 0, 0L, 100.0f, (-1.0d), 0 };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList6 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList6, constantDescArray5);
        java.util.function.UnaryOperator<java.lang.constant.ConstantDesc> constantDescUnaryOperator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            constantDescList6.replaceAll(constantDescUnaryOperator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.constant.ConstantDesc[] constantDescArray16 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList17 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList17, constantDescArray16);
        String str19 = constantDescList17.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream20 = constantDescList17.parallelStream();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator21 = constantDescList17.spliterator();
        java.util.Collection<java.lang.constant.ConstantDesc> constantDescCollection22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = constantDescList17.containsAll(constantDescCollection22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Collection.iterator()\" because \"c\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str19, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream20);
        org.junit.Assert.assertNotNull(constantDescSpliterator21);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList1 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) (byte) 10);
        constantDescList1.ensureCapacity((int) '4');
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.util.ArrayList<java.util.AbstractList<java.lang.constant.ConstantDesc>> constantDescListList0 = new java.util.ArrayList<java.util.AbstractList<java.lang.constant.ConstantDesc>>();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.lang.constant.ConstantDesc[] constantDescArray16 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList17 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList17, constantDescArray16);
        String str19 = constantDescList17.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream20 = constantDescList17.parallelStream();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc22 = constantDescList17.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 16");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str19, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream20);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList1 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) ' ');
        constantDescList1.trimToSize();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList0 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean1 = constantDescList0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.lang.constant.ConstantDesc[] constantDescArray11 = new java.lang.constant.ConstantDesc[] { 10.0f, 0.0d, 1, 10, 100.0f, (-1.0d), 0.0d, 1, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]", "hi!", (-1) };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList12 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList12, constantDescArray11);
        java.lang.constant.ConstantDesc[] constantDescArray30 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList31 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList31, constantDescArray30);
        String str33 = constantDescList31.toString();
        java.lang.constant.ConstantDesc[] constantDescArray42 = new java.lang.constant.ConstantDesc[] { 100.0d, 1.0f, "hi!", 1.0f, 100, (-1), 0.0f };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList43 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList43, constantDescArray42);
        Object obj45 = constantDescList43.clone();
        Object[] objArray46 = new Object[] { 'a', constantDescList43 };
        Object[] objArray47 = constantDescList31.toArray(objArray46);
        int int48 = constantDescList31.size();
        boolean boolean49 = constantDescList12.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList31);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream50 = constantDescList31.stream();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc53 = constantDescList31.set((int) ' ', (java.lang.constant.ConstantDesc) 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 16");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(constantDescArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str33, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj45), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 16 + "'", int48 == 16);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(constantDescStream50);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList1 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) (byte) 10);
        java.lang.constant.ConstantDesc[] constantDescArray18 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList19 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList19, constantDescArray18);
        String str21 = constantDescList19.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream22 = constantDescList19.parallelStream();
        java.util.ListIterator<java.lang.constant.ConstantDesc> constantDescItor24 = constantDescList19.listIterator((int) (byte) 10);
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList26 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc[] constantDescArray38 = new java.lang.constant.ConstantDesc[] { 10.0f, 0.0d, 1, 10, 100.0f, (-1.0d), 0.0d, 1, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]", "hi!", (-1) };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList39 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList39, constantDescArray38);
        java.lang.constant.ConstantDesc[] constantDescArray57 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList58 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList58, constantDescArray57);
        String str60 = constantDescList58.toString();
        java.lang.constant.ConstantDesc[] constantDescArray69 = new java.lang.constant.ConstantDesc[] { 100.0d, 1.0f, "hi!", 1.0f, 100, (-1), 0.0f };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList70 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList70, constantDescArray69);
        Object obj72 = constantDescList70.clone();
        Object[] objArray73 = new Object[] { 'a', constantDescList70 };
        Object[] objArray74 = constantDescList58.toArray(objArray73);
        int int75 = constantDescList58.size();
        boolean boolean76 = constantDescList39.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList58);
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList77 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        Object[] objArray78 = constantDescList77.toArray();
        boolean boolean79 = constantDescList77.isEmpty();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList80 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        java.util.List[] listArray82 = new java.util.List[5];
        @SuppressWarnings("unchecked")
        java.util.List<java.lang.constant.ConstantDesc>[] constantDescListArray83 = (java.util.List<java.lang.constant.ConstantDesc>[]) listArray82;
        constantDescListArray83[0] = constantDescList19;
        constantDescListArray83[1] = constantDescList26;
        constantDescListArray83[2] = constantDescList58;
        constantDescListArray83[3] = constantDescList77;
        constantDescListArray83[4] = constantDescList80;
        java.util.List<java.lang.constant.ConstantDesc>[] constantDescListArray94 = constantDescList1.toArray(constantDescListArray83);
        org.junit.Assert.assertNotNull(constantDescArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str21, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream22);
        org.junit.Assert.assertNotNull(constantDescItor24);
        org.junit.Assert.assertNotNull(constantDescArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(constantDescArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str60, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertEquals(obj72.toString(), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj72), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj72), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 16 + "'", int75 == 16);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(listArray82);
        org.junit.Assert.assertNotNull(constantDescListArray83);
        org.junit.Assert.assertNotNull(constantDescListArray94);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList0 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        Object[] objArray1 = constantDescList0.toArray();
        int int2 = constantDescList0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc4 = constantDescList0.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.lang.constant.ConstantDesc[] constantDescArray16 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList17 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList17, constantDescArray16);
        String str19 = constantDescList17.toString();
        java.lang.constant.ConstantDesc constantDesc22 = constantDescList17.set(0, (java.lang.constant.ConstantDesc) 10);
        org.junit.Assert.assertNotNull(constantDescArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str19, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals("'" + constantDesc22 + "' != '" + 10 + "'", constantDesc22, 10);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.lang.constant.ConstantDesc[] constantDescArray8 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList9 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList9, constantDescArray8);
        int int12 = constantDescList9.lastIndexOf((Object) 1L);
        constantDescList9.ensureCapacity(10);
        boolean boolean16 = constantDescList9.remove((Object) 1L);
        org.junit.Assert.assertNotNull(constantDescArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList1 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) (byte) 100);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream2 = constantDescList1.stream();
        org.junit.Assert.assertNotNull(constantDescStream2);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.lang.constant.ConstantDesc[] constantDescArray11 = new java.lang.constant.ConstantDesc[] { 10.0f, 0.0d, 1, 10, 100.0f, (-1.0d), 0.0d, 1, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]", "hi!", (-1) };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList12 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList12, constantDescArray11);
        java.lang.constant.ConstantDesc[] constantDescArray30 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList31 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList31, constantDescArray30);
        String str33 = constantDescList31.toString();
        java.lang.constant.ConstantDesc[] constantDescArray42 = new java.lang.constant.ConstantDesc[] { 100.0d, 1.0f, "hi!", 1.0f, 100, (-1), 0.0f };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList43 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList43, constantDescArray42);
        Object obj45 = constantDescList43.clone();
        Object[] objArray46 = new Object[] { 'a', constantDescList43 };
        Object[] objArray47 = constantDescList31.toArray(objArray46);
        int int48 = constantDescList31.size();
        boolean boolean49 = constantDescList12.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList31);
        constantDescList12.trimToSize();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator51 = constantDescList12.spliterator();
        org.junit.Assert.assertNotNull(constantDescArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(constantDescArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str33, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj45), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 16 + "'", int48 == 16);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator51);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList0 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        Object[] objArray1 = constantDescList0.toArray();
        boolean boolean2 = constantDescList0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc5 = constantDescList0.set(3, (java.lang.constant.ConstantDesc) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 0");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.lang.constant.ConstantDesc[] constantDescArray11 = new java.lang.constant.ConstantDesc[] { 10.0f, 0.0d, 1, 10, 100.0f, (-1.0d), 0.0d, 1, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]", "hi!", (-1) };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList12 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList12, constantDescArray11);
        java.lang.constant.ConstantDesc[] constantDescArray30 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList31 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList31, constantDescArray30);
        String str33 = constantDescList31.toString();
        java.lang.constant.ConstantDesc[] constantDescArray42 = new java.lang.constant.ConstantDesc[] { 100.0d, 1.0f, "hi!", 1.0f, 100, (-1), 0.0f };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList43 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList43, constantDescArray42);
        Object obj45 = constantDescList43.clone();
        Object[] objArray46 = new Object[] { 'a', constantDescList43 };
        Object[] objArray47 = constantDescList31.toArray(objArray46);
        int int48 = constantDescList31.size();
        boolean boolean49 = constantDescList12.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList31);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream50 = constantDescList31.stream();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList51 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        Object[] objArray52 = constantDescList51.toArray();
        boolean boolean53 = constantDescList51.isEmpty();
        boolean boolean54 = constantDescList31.containsAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList51);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream55 = constantDescList31.stream();
        org.junit.Assert.assertNotNull(constantDescArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(constantDescArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str33, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj45), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 16 + "'", int48 == 16);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(constantDescStream50);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(constantDescStream55);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.lang.constant.ConstantDesc[] constantDescArray16 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList17 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList17, constantDescArray16);
        String str19 = constantDescList17.toString();
        java.lang.constant.ConstantDesc[] constantDescArray28 = new java.lang.constant.ConstantDesc[] { 100.0d, 1.0f, "hi!", 1.0f, 100, (-1), 0.0f };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList29 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList29, constantDescArray28);
        Object obj31 = constantDescList29.clone();
        Object[] objArray32 = new Object[] { 'a', constantDescList29 };
        Object[] objArray33 = constantDescList17.toArray(objArray32);
        int int34 = constantDescList17.size();
        java.util.ListIterator<java.lang.constant.ConstantDesc> constantDescItor35 = constantDescList17.listIterator();
        org.junit.Assert.assertNotNull(constantDescArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str19, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj31), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 16 + "'", int34 == 16);
        org.junit.Assert.assertNotNull(constantDescItor35);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList0 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        Object[] objArray1 = constantDescList0.toArray();
        boolean boolean2 = constantDescList0.isEmpty();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList3 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        Object[] objArray4 = constantDescList3.toArray();
        int int5 = constantDescList3.size();
        int int6 = constantDescList0.lastIndexOf((Object) int5);
        java.util.function.UnaryOperator<java.lang.constant.ConstantDesc> constantDescUnaryOperator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            constantDescList0.replaceAll(constantDescUnaryOperator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.lang.constant.ConstantDesc[] constantDescArray16 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList17 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList17, constantDescArray16);
        String str19 = constantDescList17.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream20 = constantDescList17.parallelStream();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator21 = constantDescList17.spliterator();
        java.lang.constant.ConstantDesc[] constantDescArray30 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList31 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList31, constantDescArray30);
        int int34 = constantDescList31.lastIndexOf((Object) 1L);
        constantDescList31.ensureCapacity(10);
        Object obj37 = constantDescList31.clone();
        boolean boolean38 = constantDescList17.contains((Object) constantDescList31);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator39 = constantDescList17.spliterator();
        org.junit.Assert.assertNotNull(constantDescArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str19, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream20);
        org.junit.Assert.assertNotNull(constantDescSpliterator21);
        org.junit.Assert.assertNotNull(constantDescArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj37), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(constantDescSpliterator39);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.lang.constant.ConstantDesc[] constantDescArray16 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList17 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList17, constantDescArray16);
        String str19 = constantDescList17.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream20 = constantDescList17.parallelStream();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator21 = constantDescList17.spliterator();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream22 = constantDescList17.parallelStream();
        boolean boolean24 = constantDescList17.add((java.lang.constant.ConstantDesc) 0.0d);
        org.junit.Assert.assertNotNull(constantDescArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str19, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream20);
        org.junit.Assert.assertNotNull(constantDescSpliterator21);
        org.junit.Assert.assertNotNull(constantDescStream22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.lang.constant.ConstantDesc[] constantDescArray7 = new java.lang.constant.ConstantDesc[] { 100.0d, 1.0f, "hi!", 1.0f, 100, (-1), 0.0f };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList8 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList8, constantDescArray7);
        Object obj10 = constantDescList8.clone();
        java.util.ListIterator<java.lang.constant.ConstantDesc> constantDescItor12 = constantDescList8.listIterator(4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.constant.ConstantDesc> constantDescList15 = constantDescList8.subList((int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(52) > toIndex(-1)");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj10), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertNotNull(constantDescItor12);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.lang.constant.ConstantDesc[] constantDescArray1 = new java.lang.constant.ConstantDesc[] { 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList2 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList2, constantDescArray1);
        java.lang.constant.ConstantDesc constantDesc5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = constantDescList2.set(0, constantDesc5);
        Object[] objArray7 = constantDescList2.toArray();
        org.junit.Assert.assertNotNull(constantDescArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + constantDesc6 + "' != '" + 0L + "'", constantDesc6, 0L);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.lang.constant.ConstantDesc[] constantDescArray16 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList17 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList17, constantDescArray16);
        String str19 = constantDescList17.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream20 = constantDescList17.parallelStream();
        java.util.ListIterator<java.lang.constant.ConstantDesc> constantDescItor22 = constantDescList17.listIterator((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc24 = constantDescList17.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 16");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str19, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream20);
        org.junit.Assert.assertNotNull(constantDescItor22);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        java.util.ArrayList<java.lang.constant.Constable> constableList0 = new java.util.ArrayList<java.lang.constant.Constable>();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList1 = new java.util.ArrayList<java.lang.constant.ConstantDesc>(10);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList1 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc[] constantDescArray18 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList19 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList19, constantDescArray18);
        String str21 = constantDescList19.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream22 = constantDescList19.parallelStream();
        int int23 = constantDescList1.lastIndexOf((Object) constantDescList19);
        org.junit.Assert.assertNotNull(constantDescArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str21, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList1 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc[] constantDescArray10 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList11 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList11, constantDescArray10);
        int int14 = constantDescList11.lastIndexOf((Object) 1L);
        constantDescList11.ensureCapacity(10);
        boolean boolean17 = constantDescList1.containsAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList11);
        boolean boolean19 = constantDescList11.add((java.lang.constant.ConstantDesc) 10.0f);
        constantDescList11.trimToSize();
        org.junit.Assert.assertNotNull(constantDescArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.lang.constant.ConstantDesc[] constantDescArray16 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList17 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList17, constantDescArray16);
        String str19 = constantDescList17.toString();
        java.lang.constant.ConstantDesc[] constantDescArray28 = new java.lang.constant.ConstantDesc[] { 100.0d, 1.0f, "hi!", 1.0f, 100, (-1), 0.0f };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList29 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList29, constantDescArray28);
        Object obj31 = constantDescList29.clone();
        Object[] objArray32 = new Object[] { 'a', constantDescList29 };
        Object[] objArray33 = constantDescList17.toArray(objArray32);
        int int34 = constantDescList17.size();
        java.lang.constant.ConstantDesc[] constantDescArray52 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList53 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList53, constantDescArray52);
        String str55 = constantDescList53.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream56 = constantDescList53.parallelStream();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator57 = constantDescList53.spliterator();
        java.lang.constant.ConstantDesc[] constantDescArray66 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList67 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList67, constantDescArray66);
        int int70 = constantDescList67.lastIndexOf((Object) 1L);
        constantDescList67.ensureCapacity(10);
        Object obj73 = constantDescList67.clone();
        boolean boolean74 = constantDescList53.contains((Object) constantDescList67);
        boolean boolean75 = constantDescList17.addAll(2, (java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList67);
        java.lang.constant.ConstantDesc constantDesc77 = constantDescList17.remove((int) (byte) 1);
        org.junit.Assert.assertNotNull(constantDescArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str19, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj31), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 16 + "'", int34 == 16);
        org.junit.Assert.assertNotNull(constantDescArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str55, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream56);
        org.junit.Assert.assertNotNull(constantDescSpliterator57);
        org.junit.Assert.assertNotNull(constantDescArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertEquals(obj73.toString(), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj73), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj73), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertEquals("'" + constantDesc77 + "' != '" + 1 + "'", constantDesc77, 1);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        java.lang.constant.ConstantDesc[] constantDescArray8 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList9 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList9, constantDescArray8);
        int int12 = constantDescList9.lastIndexOf((Object) 1L);
        constantDescList9.ensureCapacity(10);
        Object obj15 = constantDescList9.clone();
        constantDescList9.ensureCapacity(4);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor18 = constantDescList9.iterator();
        org.junit.Assert.assertNotNull(constantDescArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj15), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertNotNull(constantDescItor18);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.lang.constant.ConstantDesc[] constantDescArray7 = new java.lang.constant.ConstantDesc[] { 100.0d, 1.0f, "hi!", 1.0f, 100, (-1), 0.0f };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList8 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList8, constantDescArray7);
        Object obj10 = constantDescList8.clone();
        java.util.ListIterator<java.lang.constant.ConstantDesc> constantDescItor12 = constantDescList8.listIterator(4);
        java.util.ListIterator<java.lang.constant.ConstantDesc> constantDescItor13 = constantDescList8.listIterator();
        org.junit.Assert.assertNotNull(constantDescArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj10), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertNotNull(constantDescItor12);
        org.junit.Assert.assertNotNull(constantDescItor13);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        java.lang.constant.ConstantDesc[] constantDescArray16 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList17 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList17, constantDescArray16);
        String str19 = constantDescList17.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream20 = constantDescList17.parallelStream();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator21 = constantDescList17.spliterator();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream22 = constantDescList17.parallelStream();
        constantDescList17.clear();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream24 = constantDescList17.stream();
        org.junit.Assert.assertNotNull(constantDescArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str19, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream20);
        org.junit.Assert.assertNotNull(constantDescSpliterator21);
        org.junit.Assert.assertNotNull(constantDescStream22);
        org.junit.Assert.assertNotNull(constantDescStream24);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList0 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        java.lang.constant.ConstantDesc[] constantDescArray17 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList18 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList18, constantDescArray17);
        String str20 = constantDescList18.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream21 = constantDescList18.parallelStream();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator22 = constantDescList18.spliterator();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream23 = constantDescList18.parallelStream();
        boolean boolean24 = constantDescList0.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList18);
        java.util.ListIterator<java.lang.constant.ConstantDesc> constantDescItor25 = constantDescList18.listIterator();
        org.junit.Assert.assertNotNull(constantDescArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str20, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream21);
        org.junit.Assert.assertNotNull(constantDescSpliterator22);
        org.junit.Assert.assertNotNull(constantDescStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(constantDescItor25);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList1 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc[] constantDescArray10 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList11 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList11, constantDescArray10);
        int int14 = constantDescList11.lastIndexOf((Object) 1L);
        constantDescList11.ensureCapacity(10);
        boolean boolean17 = constantDescList1.containsAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList11);
        Object[] objArray18 = constantDescList11.toArray();
        org.junit.Assert.assertNotNull(constantDescArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        java.lang.constant.ConstantDesc[] constantDescArray16 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList17 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList17, constantDescArray16);
        String str19 = constantDescList17.toString();
        java.lang.constant.ConstantDesc[] constantDescArray28 = new java.lang.constant.ConstantDesc[] { 100.0d, 1.0f, "hi!", 1.0f, 100, (-1), 0.0f };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList29 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList29, constantDescArray28);
        Object obj31 = constantDescList29.clone();
        Object[] objArray32 = new Object[] { 'a', constantDescList29 };
        Object[] objArray33 = constantDescList17.toArray(objArray32);
        int int34 = constantDescList17.size();
        java.lang.constant.ConstantDesc[] constantDescArray52 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList53 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList53, constantDescArray52);
        String str55 = constantDescList53.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream56 = constantDescList53.parallelStream();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator57 = constantDescList53.spliterator();
        java.lang.constant.ConstantDesc[] constantDescArray66 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList67 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList67, constantDescArray66);
        int int70 = constantDescList67.lastIndexOf((Object) 1L);
        constantDescList67.ensureCapacity(10);
        Object obj73 = constantDescList67.clone();
        boolean boolean74 = constantDescList53.contains((Object) constantDescList67);
        boolean boolean75 = constantDescList17.addAll(2, (java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList67);
        java.lang.constant.ConstantDesc constantDesc77 = null;
        java.lang.constant.ConstantDesc constantDesc78 = constantDescList67.set((int) (byte) 0, constantDesc77);
        boolean boolean79 = constantDescList67.isEmpty();
        org.junit.Assert.assertNotNull(constantDescArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str19, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj31), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 16 + "'", int34 == 16);
        org.junit.Assert.assertNotNull(constantDescArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str55, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream56);
        org.junit.Assert.assertNotNull(constantDescSpliterator57);
        org.junit.Assert.assertNotNull(constantDescArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertEquals(obj73.toString(), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj73), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj73), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertEquals("'" + constantDesc78 + "' != '" + 0 + "'", constantDesc78, 0);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        java.util.ArrayList<Object> objList0 = new java.util.ArrayList<Object>();
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList1 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) ' ');
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream2 = constantDescList1.parallelStream();
        java.util.ListIterator<java.lang.constant.ConstantDesc> constantDescItor3 = constantDescList1.listIterator();
        org.junit.Assert.assertNotNull(constantDescStream2);
        org.junit.Assert.assertNotNull(constantDescItor3);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList1 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) (byte) 10);
        java.util.Collection<java.lang.constant.ConstantDesc> constantDescCollection2 = null;
        // The following exception was thrown during execution in test generation
        try {
            System.out.println("EXPECTED EXCEPTION");
            boolean boolean3 = constantDescList1.removeAll(constantDescCollection2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        java.lang.constant.ConstantDesc[] constantDescArray16 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList17 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList17, constantDescArray16);
        String str19 = constantDescList17.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream20 = constantDescList17.parallelStream();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator21 = constantDescList17.spliterator();
        java.lang.constant.ConstantDesc[] constantDescArray30 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList31 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList31, constantDescArray30);
        int int34 = constantDescList31.lastIndexOf((Object) 1L);
        constantDescList31.ensureCapacity(10);
        Object obj37 = constantDescList31.clone();
        boolean boolean38 = constantDescList17.contains((Object) constantDescList31);
        constantDescList17.clear();
        Object obj40 = constantDescList17.clone();
        org.junit.Assert.assertNotNull(constantDescArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str19, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream20);
        org.junit.Assert.assertNotNull(constantDescSpliterator21);
        org.junit.Assert.assertNotNull(constantDescArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj37), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertEquals(obj40.toString(), "[]");
        org.junit.Assert.assertEquals(String.valueOf(obj40), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj40), "[]");
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        java.lang.constant.ConstantDesc[] constantDescArray1 = new java.lang.constant.ConstantDesc[] { 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList2 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList2, constantDescArray1);
        java.lang.constant.ConstantDesc constantDesc5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = constantDescList2.set(0, constantDesc5);
        constantDescList2.trimToSize();
        org.junit.Assert.assertNotNull(constantDescArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + constantDesc6 + "' != '" + 0L + "'", constantDesc6, 0L);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList1 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) ' ');
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream2 = constantDescList1.parallelStream();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc4 = constantDescList1.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescStream2);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList1 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) (byte) 100);
        java.lang.constant.ConstantDesc[] constantDescArray18 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList19 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList19, constantDescArray18);
        String str21 = constantDescList19.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream22 = constantDescList19.parallelStream();
        java.util.ListIterator<java.lang.constant.ConstantDesc> constantDescItor24 = constantDescList19.listIterator((int) (byte) 10);
        boolean boolean25 = constantDescList1.retainAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList19);
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList27 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) ' ');
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream28 = constantDescList27.parallelStream();
        Object obj29 = constantDescList27.clone();
        boolean boolean30 = constantDescList19.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList27);
        // The following exception was thrown during execution in test generation
        try {
            constantDescList27.add((int) (short) 100, (java.lang.constant.ConstantDesc) "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str21, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream22);
        org.junit.Assert.assertNotNull(constantDescItor24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(constantDescStream28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "[]");
        org.junit.Assert.assertEquals(String.valueOf(obj29), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        java.lang.constant.ConstantDesc[] constantDescArray11 = new java.lang.constant.ConstantDesc[] { 10.0f, 0.0d, 1, 10, 100.0f, (-1.0d), 0.0d, 1, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]", "hi!", (-1) };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList12 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList12, constantDescArray11);
        java.lang.constant.ConstantDesc[] constantDescArray30 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList31 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList31, constantDescArray30);
        String str33 = constantDescList31.toString();
        java.lang.constant.ConstantDesc[] constantDescArray42 = new java.lang.constant.ConstantDesc[] { 100.0d, 1.0f, "hi!", 1.0f, 100, (-1), 0.0f };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList43 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList43, constantDescArray42);
        Object obj45 = constantDescList43.clone();
        Object[] objArray46 = new Object[] { 'a', constantDescList43 };
        Object[] objArray47 = constantDescList31.toArray(objArray46);
        int int48 = constantDescList31.size();
        boolean boolean49 = constantDescList12.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList31);
        Object obj50 = constantDescList31.clone();
        org.junit.Assert.assertNotNull(constantDescArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(constantDescArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str33, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj45), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 16 + "'", int48 == 16);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertEquals(obj50.toString(), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(String.valueOf(obj50), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj50), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        java.lang.constant.ConstantDesc[] constantDescArray16 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList17 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList17, constantDescArray16);
        String str19 = constantDescList17.toString();
        java.lang.constant.ConstantDesc[] constantDescArray28 = new java.lang.constant.ConstantDesc[] { 100.0d, 1.0f, "hi!", 1.0f, 100, (-1), 0.0f };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList29 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList29, constantDescArray28);
        Object obj31 = constantDescList29.clone();
        Object[] objArray32 = new Object[] { 'a', constantDescList29 };
        Object[] objArray33 = constantDescList17.toArray(objArray32);
        int int34 = constantDescList17.size();
        java.lang.constant.ConstantDesc[] constantDescArray52 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList53 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList53, constantDescArray52);
        String str55 = constantDescList53.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream56 = constantDescList53.parallelStream();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator57 = constantDescList53.spliterator();
        java.lang.constant.ConstantDesc[] constantDescArray66 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList67 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList67, constantDescArray66);
        int int70 = constantDescList67.lastIndexOf((Object) 1L);
        constantDescList67.ensureCapacity(10);
        Object obj73 = constantDescList67.clone();
        boolean boolean74 = constantDescList53.contains((Object) constantDescList67);
        boolean boolean75 = constantDescList17.addAll(2, (java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList67);
        java.lang.constant.Constable[] constableArray77 = new java.lang.constant.Constable[] { 4 };
        java.lang.constant.Constable[] constableArray78 = constantDescList67.toArray(constableArray77);
        org.junit.Assert.assertNotNull(constantDescArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str19, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj31), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 16 + "'", int34 == 16);
        org.junit.Assert.assertNotNull(constantDescArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str55, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream56);
        org.junit.Assert.assertNotNull(constantDescSpliterator57);
        org.junit.Assert.assertNotNull(constantDescArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertEquals(obj73.toString(), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj73), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj73), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(constableArray77);
        org.junit.Assert.assertNotNull(constableArray78);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        java.lang.constant.ConstantDesc[] constantDescArray11 = new java.lang.constant.ConstantDesc[] { 10.0f, 0.0d, 1, 10, 100.0f, (-1.0d), 0.0d, 1, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]", "hi!", (-1) };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList12 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList12, constantDescArray11);
        java.lang.constant.ConstantDesc[] constantDescArray30 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList31 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList31, constantDescArray30);
        String str33 = constantDescList31.toString();
        java.lang.constant.ConstantDesc[] constantDescArray42 = new java.lang.constant.ConstantDesc[] { 100.0d, 1.0f, "hi!", 1.0f, 100, (-1), 0.0f };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList43 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList43, constantDescArray42);
        Object obj45 = constantDescList43.clone();
        Object[] objArray46 = new Object[] { 'a', constantDescList43 };
        Object[] objArray47 = constantDescList31.toArray(objArray46);
        int int48 = constantDescList31.size();
        boolean boolean49 = constantDescList12.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList31);
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList51 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) ' ');
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream52 = constantDescList51.parallelStream();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList54 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc[] constantDescArray63 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList64 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList64, constantDescArray63);
        int int67 = constantDescList64.lastIndexOf((Object) 1L);
        constantDescList64.ensureCapacity(10);
        boolean boolean70 = constantDescList54.containsAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList64);
        boolean boolean71 = constantDescList51.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList54);
        boolean boolean72 = constantDescList12.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList54);
        int int73 = constantDescList12.size();
        // The following exception was thrown during execution in test generation
        try {
            constantDescList12.add((int) (byte) 100, (java.lang.constant.ConstantDesc) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 27");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(constantDescArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str33, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj45), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 16 + "'", int48 == 16);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(constantDescStream52);
        org.junit.Assert.assertNotNull(constantDescArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 27 + "'", int73 == 27);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        java.lang.constant.ConstantDesc[] constantDescArray16 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList17 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList17, constantDescArray16);
        String str19 = constantDescList17.toString();
        java.lang.constant.ConstantDesc[] constantDescArray28 = new java.lang.constant.ConstantDesc[] { 100.0d, 1.0f, "hi!", 1.0f, 100, (-1), 0.0f };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList29 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList29, constantDescArray28);
        Object obj31 = constantDescList29.clone();
        Object[] objArray32 = new Object[] { 'a', constantDescList29 };
        Object[] objArray33 = constantDescList17.toArray(objArray32);
        int int34 = constantDescList17.size();
        java.lang.constant.ConstantDesc[] constantDescArray52 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList53 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList53, constantDescArray52);
        String str55 = constantDescList53.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream56 = constantDescList53.parallelStream();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator57 = constantDescList53.spliterator();
        java.lang.constant.ConstantDesc[] constantDescArray66 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList67 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList67, constantDescArray66);
        int int70 = constantDescList67.lastIndexOf((Object) 1L);
        constantDescList67.ensureCapacity(10);
        Object obj73 = constantDescList67.clone();
        boolean boolean74 = constantDescList53.contains((Object) constantDescList67);
        boolean boolean75 = constantDescList17.addAll(2, (java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList67);
        int int76 = constantDescList67.size();
        constantDescList67.clear();
        org.junit.Assert.assertNotNull(constantDescArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str19, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj31), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 16 + "'", int34 == 16);
        org.junit.Assert.assertNotNull(constantDescArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str55, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream56);
        org.junit.Assert.assertNotNull(constantDescSpliterator57);
        org.junit.Assert.assertNotNull(constantDescArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertEquals(obj73.toString(), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj73), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj73), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 8 + "'", int76 == 8);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        java.lang.constant.ConstantDesc[] constantDescArray16 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList17 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList17, constantDescArray16);
        String str19 = constantDescList17.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream20 = constantDescList17.parallelStream();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator21 = constantDescList17.spliterator();
        java.lang.constant.ConstantDesc[] constantDescArray30 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList31 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList31, constantDescArray30);
        int int34 = constantDescList31.lastIndexOf((Object) 1L);
        constantDescList31.ensureCapacity(10);
        Object obj37 = constantDescList31.clone();
        boolean boolean38 = constantDescList17.contains((Object) constantDescList31);
        java.lang.constant.ConstantDesc constantDesc40 = constantDescList17.get((int) (short) 10);
        org.junit.Assert.assertNotNull(constantDescArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str19, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream20);
        org.junit.Assert.assertNotNull(constantDescSpliterator21);
        org.junit.Assert.assertNotNull(constantDescArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj37), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + constantDesc40 + "' != '" + 1 + "'", constantDesc40, 1);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        java.lang.constant.ConstantDesc[] constantDescArray11 = new java.lang.constant.ConstantDesc[] { 10.0f, 0.0d, 1, 10, 100.0f, (-1.0d), 0.0d, 1, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]", "hi!", (-1) };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList12 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList12, constantDescArray11);
        java.lang.constant.ConstantDesc[] constantDescArray30 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList31 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList31, constantDescArray30);
        String str33 = constantDescList31.toString();
        java.lang.constant.ConstantDesc[] constantDescArray42 = new java.lang.constant.ConstantDesc[] { 100.0d, 1.0f, "hi!", 1.0f, 100, (-1), 0.0f };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList43 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList43, constantDescArray42);
        Object obj45 = constantDescList43.clone();
        Object[] objArray46 = new Object[] { 'a', constantDescList43 };
        Object[] objArray47 = constantDescList31.toArray(objArray46);
        int int48 = constantDescList31.size();
        boolean boolean49 = constantDescList12.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList31);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream50 = constantDescList31.parallelStream();
        constantDescList31.clear();
        boolean boolean53 = constantDescList31.contains((Object) 100.0f);
        org.junit.Assert.assertNotNull(constantDescArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(constantDescArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str33, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj45), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 16 + "'", int48 == 16);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(constantDescStream50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        java.lang.constant.ConstantDesc[] constantDescArray8 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList9 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList9, constantDescArray8);
        int int12 = constantDescList9.lastIndexOf((Object) 1L);
        java.util.function.UnaryOperator<java.lang.constant.ConstantDesc> constantDescUnaryOperator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            constantDescList9.replaceAll(constantDescUnaryOperator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList0 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        Object[] objArray1 = constantDescList0.toArray();
        int int2 = constantDescList0.size();
        java.util.List<java.lang.constant.ConstantDesc> constantDescList5 = constantDescList0.subList((int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(constantDescList5);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        java.lang.constant.ConstantDesc[] constantDescArray16 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList17 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList17, constantDescArray16);
        String str19 = constantDescList17.toString();
        constantDescList17.add(0, (java.lang.constant.ConstantDesc) (-1.0f));
        boolean boolean24 = constantDescList17.add((java.lang.constant.ConstantDesc) 16);
        java.lang.constant.ConstantDesc constantDesc26 = constantDescList17.get(10);
        org.junit.Assert.assertNotNull(constantDescArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str19, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + constantDesc26 + "' != '" + 0L + "'", constantDesc26, 0L);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList0 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        Object[] objArray1 = constantDescList0.toArray();
        int int2 = constantDescList0.size();
        java.util.ListIterator<java.lang.constant.ConstantDesc> constantDescItor4 = constantDescList0.listIterator(0);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(constantDescItor4);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        java.lang.constant.ConstantDesc[] constantDescArray11 = new java.lang.constant.ConstantDesc[] { 10.0f, 0.0d, 1, 10, 100.0f, (-1.0d), 0.0d, 1, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]", "hi!", (-1) };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList12 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList12, constantDescArray11);
        java.lang.constant.ConstantDesc[] constantDescArray30 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList31 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList31, constantDescArray30);
        String str33 = constantDescList31.toString();
        java.lang.constant.ConstantDesc[] constantDescArray42 = new java.lang.constant.ConstantDesc[] { 100.0d, 1.0f, "hi!", 1.0f, 100, (-1), 0.0f };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList43 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList43, constantDescArray42);
        Object obj45 = constantDescList43.clone();
        Object[] objArray46 = new Object[] { 'a', constantDescList43 };
        Object[] objArray47 = constantDescList31.toArray(objArray46);
        int int48 = constantDescList31.size();
        boolean boolean49 = constantDescList12.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList31);
        int int51 = constantDescList31.lastIndexOf((Object) (-1.0f));
        org.junit.Assert.assertNotNull(constantDescArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(constantDescArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str33, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj45), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 16 + "'", int48 == 16);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        java.lang.constant.ConstantDesc[] constantDescArray16 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList17 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList17, constantDescArray16);
        String str19 = constantDescList17.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream20 = constantDescList17.parallelStream();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator21 = constantDescList17.spliterator();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream22 = constantDescList17.parallelStream();
        Class<?> wildcardClass23 = constantDescList17.getClass();
        org.junit.Assert.assertNotNull(constantDescArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str19, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream20);
        org.junit.Assert.assertNotNull(constantDescSpliterator21);
        org.junit.Assert.assertNotNull(constantDescStream22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList0 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        Object[] objArray1 = constantDescList0.toArray();
        boolean boolean2 = constantDescList0.isEmpty();
        int int3 = constantDescList0.size();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }
}

