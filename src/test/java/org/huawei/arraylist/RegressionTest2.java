package org.huawei.arraylist;

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
        java.lang.constant.ConstantDesc[] constantDescArray8 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList9 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList9, constantDescArray8);
        int int12 = constantDescList9.lastIndexOf((Object) 1L);
        constantDescList9.ensureCapacity(10);
        boolean boolean16 = constantDescList9.remove((Object) 1L);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor17 = constantDescList9.iterator();
        org.junit.Assert.assertNotNull(constantDescArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(constantDescItor17);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        java.lang.constant.ConstantDesc[] constantDescArray1 = new java.lang.constant.ConstantDesc[] { 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList2 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList2, constantDescArray1);
        java.lang.constant.ConstantDesc constantDesc5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = constantDescList2.set(0, constantDesc5);
        Object[] objArray7 = constantDescList2.toArray();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList8 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        java.util.ListIterator<java.lang.constant.ConstantDesc> constantDescItor9 = constantDescList8.listIterator();
        boolean boolean10 = constantDescList2.remove((Object) constantDescList8);
        java.lang.constant.ConstantDesc[] constantDescArray22 = new java.lang.constant.ConstantDesc[] { 10.0f, 0.0d, 1, 10, 100.0f, (-1.0d), 0.0d, 1, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]", "hi!", (-1) };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList23 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList23, constantDescArray22);
        java.lang.constant.ConstantDesc[] constantDescArray41 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList42 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList42, constantDescArray41);
        String str44 = constantDescList42.toString();
        java.lang.constant.ConstantDesc[] constantDescArray53 = new java.lang.constant.ConstantDesc[] { 100.0d, 1.0f, "hi!", 1.0f, 100, (-1), 0.0f };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList54 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList54, constantDescArray53);
        Object obj56 = constantDescList54.clone();
        Object[] objArray57 = new Object[] { 'a', constantDescList54 };
        Object[] objArray58 = constantDescList42.toArray(objArray57);
        int int59 = constantDescList42.size();
        boolean boolean60 = constantDescList23.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList42);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream61 = constantDescList42.stream();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList62 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        Object[] objArray63 = constantDescList62.toArray();
        boolean boolean64 = constantDescList62.isEmpty();
        boolean boolean65 = constantDescList42.containsAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList62);
        boolean boolean66 = constantDescList8.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList42);
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList68 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) '#');
        boolean boolean69 = constantDescList8.equals((Object) constantDescList68);
        Class<?> wildcardClass70 = constantDescList8.getClass();
        org.junit.Assert.assertNotNull(constantDescArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + constantDesc6 + "' != '" + 0L + "'", constantDesc6, 0L);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNotNull(constantDescItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(constantDescArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(constantDescArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str44, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertEquals(obj56.toString(), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj56), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj56), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 16 + "'", int59 == 16);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(constantDescStream61);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList1 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc[] constantDescArray10 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList11 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList11, constantDescArray10);
        int int14 = constantDescList11.lastIndexOf((Object) 1L);
        constantDescList11.ensureCapacity(10);
        boolean boolean17 = constantDescList1.containsAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList11);
        boolean boolean19 = constantDescList11.add((java.lang.constant.ConstantDesc) 10.0f);
        constantDescList11.trimToSize();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList21 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList11);
        java.util.ListIterator<java.lang.constant.ConstantDesc> constantDescItor23 = constantDescList21.listIterator(8);
        Object[] objArray24 = constantDescList21.toArray();
        Object[] objArray25 = constantDescList21.toArray();
        constantDescList21.clear();
        org.junit.Assert.assertNotNull(constantDescArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(constantDescItor23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0, 10.0]");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList80 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) (byte) 100);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream81 = constantDescList80.stream();
        int int82 = constantDescList80.size();
        Object[] objArray83 = constantDescList80.toArray();
        boolean boolean84 = constantDescList67.equals((Object) constantDescList80);
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
        org.junit.Assert.assertEquals("'" + constantDesc78 + "' != '" + 0 + "'", constantDesc78, 0);
        org.junit.Assert.assertNotNull(constantDescStream81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray83), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray83), "[]");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        java.lang.constant.ConstantDesc[] constantDescArray1 = new java.lang.constant.ConstantDesc[] { 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList2 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList2, constantDescArray1);
        java.lang.constant.ConstantDesc constantDesc5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = constantDescList2.set(0, constantDesc5);
        Object[] objArray7 = constantDescList2.toArray();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList8 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        java.util.ListIterator<java.lang.constant.ConstantDesc> constantDescItor9 = constantDescList8.listIterator();
        boolean boolean10 = constantDescList2.remove((Object) constantDescList8);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator11 = constantDescList2.spliterator();
        java.lang.constant.ConstantDesc[] constantDescArray23 = new java.lang.constant.ConstantDesc[] { 10.0f, 0.0d, 1, 10, 100.0f, (-1.0d), 0.0d, 1, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]", "hi!", (-1) };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList24 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList24, constantDescArray23);
        java.lang.constant.ConstantDesc[] constantDescArray42 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList43 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList43, constantDescArray42);
        String str45 = constantDescList43.toString();
        java.lang.constant.ConstantDesc[] constantDescArray54 = new java.lang.constant.ConstantDesc[] { 100.0d, 1.0f, "hi!", 1.0f, 100, (-1), 0.0f };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList55 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList55, constantDescArray54);
        Object obj57 = constantDescList55.clone();
        Object[] objArray58 = new Object[] { 'a', constantDescList55 };
        Object[] objArray59 = constantDescList43.toArray(objArray58);
        int int60 = constantDescList43.size();
        boolean boolean61 = constantDescList24.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList43);
        constantDescList43.clear();
        boolean boolean64 = constantDescList43.add((java.lang.constant.ConstantDesc) 10.0d);
        boolean boolean65 = constantDescList2.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList43);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator66 = constantDescList2.spliterator();
        org.junit.Assert.assertNotNull(constantDescArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + constantDesc6 + "' != '" + 0L + "'", constantDesc6, 0L);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNotNull(constantDescItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(constantDescSpliterator11);
        org.junit.Assert.assertNotNull(constantDescArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(constantDescArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str45, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertEquals(obj57.toString(), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj57), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj57), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 16 + "'", int60 == 16);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator66);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList56 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean57 = constantDescList31.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList56);
        java.lang.constant.ConstantDesc[] constantDescArray59 = new java.lang.constant.ConstantDesc[] { 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList60 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList60, constantDescArray59);
        java.lang.constant.ConstantDesc constantDesc63 = null;
        java.lang.constant.ConstantDesc constantDesc64 = constantDescList60.set(0, constantDesc63);
        Object[] objArray65 = constantDescList60.toArray();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList66 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        Object[] objArray67 = constantDescList66.toArray();
        boolean boolean68 = constantDescList60.remove((Object) constantDescList66);
        Object[] objArray69 = constantDescList66.toArray();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor70 = constantDescList66.iterator();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream71 = constantDescList66.stream();
        String str72 = constantDescList66.toString();
        boolean boolean73 = constantDescList56.retainAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList66);
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
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(constantDescArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + constantDesc64 + "' != '" + 0L + "'", constantDesc64, 0L);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[null]");
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[]");
        org.junit.Assert.assertNotNull(constantDescItor70);
        org.junit.Assert.assertNotNull(constantDescStream71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "[]" + "'", str72, "[]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList0 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        java.lang.constant.ConstantDesc[] constantDescArray17 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList18 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList18, constantDescArray17);
        String str20 = constantDescList18.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream21 = constantDescList18.parallelStream();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator22 = constantDescList18.spliterator();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream23 = constantDescList18.parallelStream();
        boolean boolean24 = constantDescList0.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList18);
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList25 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList0);
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList27 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        java.lang.constant.ConstantDesc[] constantDescArray36 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList37 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList37, constantDescArray36);
        int int40 = constantDescList37.lastIndexOf((Object) 1L);
        constantDescList37.ensureCapacity(10);
        Object obj43 = constantDescList37.clone();
        constantDescList37.ensureCapacity(4);
        Object[] objArray46 = constantDescList37.toArray();
        int int47 = constantDescList27.lastIndexOf((Object) objArray46);
        java.lang.constant.ConstantDesc[] constantDescArray49 = new java.lang.constant.ConstantDesc[] { 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList50 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList50, constantDescArray49);
        java.lang.constant.ConstantDesc constantDesc53 = null;
        java.lang.constant.ConstantDesc constantDesc54 = constantDescList50.set(0, constantDesc53);
        constantDescList50.trimToSize();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream56 = constantDescList50.stream();
        boolean boolean57 = constantDescList27.contains((Object) constantDescStream56);
        boolean boolean58 = constantDescList25.addAll(3, (java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList27);
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList59 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList27);
        int int61 = constantDescList59.lastIndexOf((Object) "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str20, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream21);
        org.junit.Assert.assertNotNull(constantDescSpliterator22);
        org.junit.Assert.assertNotNull(constantDescStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(constantDescArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertEquals(obj43.toString(), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj43), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj43), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(constantDescArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + constantDesc54 + "' != '" + 0L + "'", constantDesc54, 0L);
        org.junit.Assert.assertNotNull(constantDescStream56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList1 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) ' ');
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream2 = constantDescList1.parallelStream();
        Object obj3 = constantDescList1.clone();
        CharSequence[] charSequenceArray10 = new CharSequence[] { "", "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]", "", "hi!", "", "" };
        CharSequence[] charSequenceArray11 = constantDescList1.toArray(charSequenceArray10);
        Object obj12 = null;
        int int13 = constantDescList1.lastIndexOf(obj12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc15 = constantDescList1.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescStream2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "[]");
        org.junit.Assert.assertEquals(String.valueOf(obj3), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "[]");
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(charSequenceArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList1 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc[] constantDescArray18 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList19 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList19, constantDescArray18);
        String str21 = constantDescList19.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream22 = constantDescList19.parallelStream();
        int int23 = constantDescList1.lastIndexOf((Object) constantDescList19);
        java.util.stream.Stream[] streamArray25 = new java.util.stream.Stream[0];
        @SuppressWarnings("unchecked")
        java.util.stream.Stream<java.lang.constant.ConstantDesc>[] constantDescStreamArray26 = (java.util.stream.Stream<java.lang.constant.ConstantDesc>[]) streamArray25;
        java.util.stream.Stream<java.lang.constant.ConstantDesc>[] constantDescStreamArray27 = constantDescList1.toArray((java.util.stream.Stream<java.lang.constant.ConstantDesc>[]) streamArray25);
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList28 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList1);
        boolean boolean29 = constantDescList28.isEmpty();
        org.junit.Assert.assertNotNull(constantDescArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str21, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(streamArray25);
        org.junit.Assert.assertNotNull(constantDescStreamArray26);
        org.junit.Assert.assertNotNull(constantDescStreamArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
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
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList55 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList51);
        java.util.ListIterator<java.lang.constant.ConstantDesc> constantDescItor56 = constantDescList51.listIterator();
        constantDescList51.ensureCapacity((int) (byte) 1);
        boolean boolean60 = constantDescList51.add((java.lang.constant.ConstantDesc) (-1.0d));
        String str61 = constantDescList51.toString();
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
        org.junit.Assert.assertNotNull(constantDescItor56);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "[-1.0]" + "'", str61, "[-1.0]");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        java.lang.constant.ConstantDesc[] constantDescArray8 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList9 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList9, constantDescArray8);
        int int12 = constantDescList9.lastIndexOf((Object) 1L);
        constantDescList9.ensureCapacity(10);
        Object[] objArray15 = constantDescList9.toArray();
        String str16 = constantDescList9.toString();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor17 = constantDescList9.iterator();
        constantDescList9.trimToSize();
        org.junit.Assert.assertNotNull(constantDescArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]" + "'", str16, "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertNotNull(constantDescItor17);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList1 = new java.util.ArrayList<java.lang.constant.ConstantDesc>(16);
        java.lang.constant.ConstantDesc[] constantDescArray18 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList19 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList19, constantDescArray18);
        String str21 = constantDescList19.toString();
        constantDescList19.add(0, (java.lang.constant.ConstantDesc) (-1.0f));
        boolean boolean26 = constantDescList19.add((java.lang.constant.ConstantDesc) 16);
        Object obj27 = constantDescList19.clone();
        boolean boolean28 = constantDescList19.isEmpty();
        java.lang.constant.ConstantDesc[] constantDescArray30 = new java.lang.constant.ConstantDesc[] { 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList31 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList31, constantDescArray30);
        java.lang.constant.ConstantDesc constantDesc34 = null;
        java.lang.constant.ConstantDesc constantDesc35 = constantDescList31.set(0, constantDesc34);
        constantDescList31.trimToSize();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream37 = constantDescList31.stream();
        java.util.ListIterator<java.lang.constant.ConstantDesc> constantDescItor39 = constantDescList31.listIterator(0);
        boolean boolean40 = constantDescList19.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList31);
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList43 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc[] constantDescArray52 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList53 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList53, constantDescArray52);
        int int56 = constantDescList53.lastIndexOf((Object) 1L);
        constantDescList53.ensureCapacity(10);
        boolean boolean59 = constantDescList43.containsAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList53);
        boolean boolean61 = constantDescList53.add((java.lang.constant.ConstantDesc) 10.0f);
        Object obj62 = null;
        int int63 = constantDescList53.indexOf(obj62);
        Object obj64 = constantDescList53.clone();
        boolean boolean65 = constantDescList19.addAll((int) (byte) 0, (java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList53);
        boolean boolean66 = constantDescList1.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList53);
        org.junit.Assert.assertNotNull(constantDescArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str21, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "[-1.0, 10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0, 16]");
        org.junit.Assert.assertEquals(String.valueOf(obj27), "[-1.0, 10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0, 16]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "[-1.0, 10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0, 16]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(constantDescArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + constantDesc35 + "' != '" + 0L + "'", constantDesc35, 0L);
        org.junit.Assert.assertNotNull(constantDescStream37);
        org.junit.Assert.assertNotNull(constantDescItor39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(constantDescArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertEquals(obj64.toString(), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0, 10.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj64), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0, 10.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj64), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList1 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc3 = constantDescList1.remove((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        java.lang.constant.ConstantDesc[] constantDescArray1 = new java.lang.constant.ConstantDesc[] { 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList2 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList2, constantDescArray1);
        java.lang.constant.ConstantDesc constantDesc5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = constantDescList2.set(0, constantDesc5);
        Object[] objArray7 = constantDescList2.toArray();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList8 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        java.util.ListIterator<java.lang.constant.ConstantDesc> constantDescItor9 = constantDescList8.listIterator();
        boolean boolean10 = constantDescList2.remove((Object) constantDescList8);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator11 = constantDescList2.spliterator();
        java.lang.constant.ConstantDesc[] constantDescArray23 = new java.lang.constant.ConstantDesc[] { 10.0f, 0.0d, 1, 10, 100.0f, (-1.0d), 0.0d, 1, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]", "hi!", (-1) };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList24 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList24, constantDescArray23);
        java.lang.constant.ConstantDesc[] constantDescArray42 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList43 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList43, constantDescArray42);
        String str45 = constantDescList43.toString();
        java.lang.constant.ConstantDesc[] constantDescArray54 = new java.lang.constant.ConstantDesc[] { 100.0d, 1.0f, "hi!", 1.0f, 100, (-1), 0.0f };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList55 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList55, constantDescArray54);
        Object obj57 = constantDescList55.clone();
        Object[] objArray58 = new Object[] { 'a', constantDescList55 };
        Object[] objArray59 = constantDescList43.toArray(objArray58);
        int int60 = constantDescList43.size();
        boolean boolean61 = constantDescList24.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList43);
        constantDescList43.clear();
        boolean boolean64 = constantDescList43.add((java.lang.constant.ConstantDesc) 10.0d);
        boolean boolean65 = constantDescList2.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList43);
        java.lang.constant.ConstantDesc[] constantDescArray74 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList75 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList75, constantDescArray74);
        int int78 = constantDescList75.lastIndexOf((Object) 1L);
        constantDescList75.ensureCapacity(10);
        java.util.ArrayList<java.lang.constant.Constable[]> constableArrayList81 = new java.util.ArrayList<java.lang.constant.Constable[]>();
        boolean boolean82 = constantDescList75.remove((Object) constableArrayList81);
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList83 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean84 = constantDescList75.containsAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList83);
        boolean boolean85 = constantDescList2.retainAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList83);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator86 = constantDescList2.spliterator();
        org.junit.Assert.assertNotNull(constantDescArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + constantDesc6 + "' != '" + 0L + "'", constantDesc6, 0L);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNotNull(constantDescItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(constantDescSpliterator11);
        org.junit.Assert.assertNotNull(constantDescArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(constantDescArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str45, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertEquals(obj57.toString(), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj57), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj57), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 16 + "'", int60 == 16);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(constantDescArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator86);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        java.lang.constant.ConstantDesc[] constantDescArray8 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList9 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList9, constantDescArray8);
        int int12 = constantDescList9.lastIndexOf((Object) 1L);
        constantDescList9.ensureCapacity(10);
        Object obj15 = constantDescList9.clone();
        constantDescList9.ensureCapacity(4);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor18 = constantDescList9.iterator();
        Object obj19 = constantDescList9.clone();
        java.lang.constant.ConstantDesc[] constantDescArray28 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList29 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList29, constantDescArray28);
        int int32 = constantDescList29.lastIndexOf((Object) 1L);
        constantDescList29.ensureCapacity(10);
        Object obj35 = constantDescList29.clone();
        constantDescList29.ensureCapacity(4);
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList38 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        Object[] objArray39 = constantDescList38.toArray();
        int int40 = constantDescList38.size();
        java.util.List<java.lang.constant.ConstantDesc> constantDescList43 = constantDescList38.subList((int) (short) 0, (int) (byte) 0);
        boolean boolean44 = constantDescList29.contains((Object) (byte) 0);
        java.lang.constant.ConstantDesc[] constantDescArray53 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList54 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList54, constantDescArray53);
        int int57 = constantDescList54.lastIndexOf((Object) 1L);
        constantDescList54.ensureCapacity(10);
        Object obj60 = constantDescList54.clone();
        constantDescList54.ensureCapacity(4);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor63 = constantDescList54.iterator();
        Object obj64 = constantDescList54.clone();
        java.lang.constant.ConstantDesc[] constantDescArray81 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList82 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList82, constantDescArray81);
        String str84 = constantDescList82.toString();
        constantDescList82.add(0, (java.lang.constant.ConstantDesc) (-1.0f));
        boolean boolean89 = constantDescList82.add((java.lang.constant.ConstantDesc) 16);
        Object obj90 = constantDescList82.clone();
        boolean boolean91 = constantDescList54.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList82);
        boolean boolean92 = constantDescList29.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList54);
        java.util.ListIterator<java.lang.constant.ConstantDesc> constantDescItor93 = constantDescList29.listIterator();
        boolean boolean94 = constantDescList9.remove((Object) constantDescItor93);
        constantDescList9.ensureCapacity(3);
        org.junit.Assert.assertNotNull(constantDescArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj15), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertNotNull(constantDescItor18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj19), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertNotNull(constantDescArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj35), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(constantDescList43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(constantDescArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertEquals(obj60.toString(), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj60), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj60), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertNotNull(constantDescItor63);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertEquals(obj64.toString(), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj64), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj64), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertNotNull(constantDescArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str84, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(obj90);
        org.junit.Assert.assertEquals(obj90.toString(), "[-1.0, 10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0, 16]");
        org.junit.Assert.assertEquals(String.valueOf(obj90), "[-1.0, 10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0, 16]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj90), "[-1.0, 10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0, 16]");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(constantDescItor93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        java.lang.constant.ConstantDesc[] constantDescArray16 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList17 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList17, constantDescArray16);
        String str19 = constantDescList17.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream20 = constantDescList17.parallelStream();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator21 = constantDescList17.spliterator();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream22 = constantDescList17.parallelStream();
        constantDescList17.ensureCapacity(0);
        java.lang.constant.ConstantDesc[] constantDescArray36 = new java.lang.constant.ConstantDesc[] { 10.0f, 0.0d, 1, 10, 100.0f, (-1.0d), 0.0d, 1, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]", "hi!", (-1) };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList37 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList37, constantDescArray36);
        java.lang.constant.ConstantDesc[] constantDescArray55 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList56 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList56, constantDescArray55);
        String str58 = constantDescList56.toString();
        java.lang.constant.ConstantDesc[] constantDescArray67 = new java.lang.constant.ConstantDesc[] { 100.0d, 1.0f, "hi!", 1.0f, 100, (-1), 0.0f };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList68 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList68, constantDescArray67);
        Object obj70 = constantDescList68.clone();
        Object[] objArray71 = new Object[] { 'a', constantDescList68 };
        Object[] objArray72 = constantDescList56.toArray(objArray71);
        int int73 = constantDescList56.size();
        boolean boolean74 = constantDescList37.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList56);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream75 = constantDescList56.stream();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList76 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        Object[] objArray77 = constantDescList76.toArray();
        boolean boolean78 = constantDescList76.isEmpty();
        boolean boolean79 = constantDescList56.containsAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList76);
        boolean boolean80 = constantDescList17.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList56);
        int int81 = constantDescList17.size();
        org.junit.Assert.assertNotNull(constantDescArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str19, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream20);
        org.junit.Assert.assertNotNull(constantDescSpliterator21);
        org.junit.Assert.assertNotNull(constantDescStream22);
        org.junit.Assert.assertNotNull(constantDescArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(constantDescArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str58, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertEquals(obj70.toString(), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj70), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj70), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 16 + "'", int73 == 16);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(constantDescStream75);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        java.lang.constant.ConstantDesc[] constantDescArray1 = new java.lang.constant.ConstantDesc[] { 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList2 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList2, constantDescArray1);
        java.lang.constant.ConstantDesc constantDesc5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = constantDescList2.set(0, constantDesc5);
        Object[] objArray7 = constantDescList2.toArray();
        java.util.ListIterator<java.lang.constant.ConstantDesc> constantDescItor8 = constantDescList2.listIterator();
        String str9 = constantDescList2.toString();
        java.lang.constant.ConstantDesc[] constantDescArray26 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList27 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList27, constantDescArray26);
        String str29 = constantDescList27.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream30 = constantDescList27.parallelStream();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator31 = constantDescList27.spliterator();
        java.lang.constant.ConstantDesc[] constantDescArray40 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList41 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList41, constantDescArray40);
        int int44 = constantDescList41.lastIndexOf((Object) 1L);
        constantDescList41.ensureCapacity(10);
        Object obj47 = constantDescList41.clone();
        boolean boolean48 = constantDescList27.contains((Object) constantDescList41);
        java.lang.constant.ConstantDesc constantDesc50 = constantDescList27.get((int) (short) 10);
        java.lang.constant.ConstantDesc constantDesc53 = constantDescList27.set((int) (short) 1, (java.lang.constant.ConstantDesc) (-1.0f));
        int int55 = constantDescList27.lastIndexOf((Object) "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        Object obj56 = constantDescList27.clone();
        boolean boolean57 = constantDescList2.containsAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList27);
        org.junit.Assert.assertNotNull(constantDescArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + constantDesc6 + "' != '" + 0L + "'", constantDesc6, 0L);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNotNull(constantDescItor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[null]" + "'", str9, "[null]");
        org.junit.Assert.assertNotNull(constantDescArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str29, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream30);
        org.junit.Assert.assertNotNull(constantDescSpliterator31);
        org.junit.Assert.assertNotNull(constantDescArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertEquals(obj47.toString(), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj47), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj47), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + constantDesc50 + "' != '" + 1 + "'", constantDesc50, 1);
        org.junit.Assert.assertEquals("'" + constantDesc53 + "' != '" + 1 + "'", constantDesc53, 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertEquals(obj56.toString(), "[10, -1.0, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(String.valueOf(obj56), "[10, -1.0, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj56), "[10, -1.0, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList1 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) '#');
        java.lang.constant.ConstantDesc[] constantDescArray18 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList19 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList19, constantDescArray18);
        String str21 = constantDescList19.toString();
        constantDescList19.add(0, (java.lang.constant.ConstantDesc) (-1.0f));
        boolean boolean26 = constantDescList19.add((java.lang.constant.ConstantDesc) 16);
        java.lang.constant.ConstantDesc constantDesc28 = constantDescList19.get(10);
        boolean boolean29 = constantDescList1.containsAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList19);
        java.lang.constant.ConstantDesc[] constantDescArray46 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList47 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList47, constantDescArray46);
        String str49 = constantDescList47.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream50 = constantDescList47.parallelStream();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator51 = constantDescList47.spliterator();
        java.lang.constant.ConstantDesc[] constantDescArray60 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList61 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList61, constantDescArray60);
        int int64 = constantDescList61.lastIndexOf((Object) 1L);
        constantDescList61.ensureCapacity(10);
        Object obj67 = constantDescList61.clone();
        boolean boolean68 = constantDescList47.contains((Object) constantDescList61);
        constantDescList47.clear();
        Object obj70 = constantDescList47.clone();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream71 = constantDescList47.stream();
        boolean boolean72 = constantDescList1.equals((Object) constantDescList47);
        boolean boolean74 = constantDescList1.add((java.lang.constant.ConstantDesc) "[0, 0.0]");
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream75 = constantDescList1.parallelStream();
        org.junit.Assert.assertNotNull(constantDescArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str21, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + constantDesc28 + "' != '" + 0L + "'", constantDesc28, 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(constantDescArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str49, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream50);
        org.junit.Assert.assertNotNull(constantDescSpliterator51);
        org.junit.Assert.assertNotNull(constantDescArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertEquals(obj67.toString(), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj67), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj67), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertEquals(obj70.toString(), "[]");
        org.junit.Assert.assertEquals(String.valueOf(obj70), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj70), "[]");
        org.junit.Assert.assertNotNull(constantDescStream71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(constantDescStream75);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList1 = new java.util.ArrayList<java.lang.constant.ConstantDesc>(17);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
        Object[] objArray95 = constantDescList1.toArray();
        java.util.function.UnaryOperator<java.lang.constant.ConstantDesc> constantDescUnaryOperator96 = null;
        // The following exception was thrown during execution in test generation
        try {
            constantDescList1.replaceAll(constantDescUnaryOperator96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(objArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray95), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray95), "[]");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        java.lang.constant.ConstantDesc[] constantDescArray8 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList9 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList9, constantDescArray8);
        int int12 = constantDescList9.lastIndexOf((Object) 1L);
        constantDescList9.ensureCapacity(10);
        Object[] objArray15 = constantDescList9.toArray();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList17 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc[] constantDescArray26 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList27 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList27, constantDescArray26);
        int int30 = constantDescList27.lastIndexOf((Object) 1L);
        constantDescList27.ensureCapacity(10);
        boolean boolean33 = constantDescList17.containsAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList27);
        boolean boolean35 = constantDescList27.add((java.lang.constant.ConstantDesc) 10.0f);
        constantDescList27.trimToSize();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList37 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList27);
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList39 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc[] constantDescArray48 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList49 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList49, constantDescArray48);
        int int52 = constantDescList49.lastIndexOf((Object) 1L);
        constantDescList49.ensureCapacity(10);
        boolean boolean55 = constantDescList39.containsAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList49);
        boolean boolean56 = constantDescList27.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList39);
        boolean boolean57 = constantDescList9.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList27);
        java.util.ListIterator<java.lang.constant.ConstantDesc> constantDescItor59 = constantDescList9.listIterator((int) (short) 0);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream60 = constantDescList9.parallelStream();
        org.junit.Assert.assertNotNull(constantDescArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertNotNull(constantDescArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(constantDescArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(constantDescItor59);
        org.junit.Assert.assertNotNull(constantDescStream60);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
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
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList57 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc[] constantDescArray66 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList67 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList67, constantDescArray66);
        int int70 = constantDescList67.lastIndexOf((Object) 1L);
        constantDescList67.ensureCapacity(10);
        boolean boolean73 = constantDescList57.containsAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList67);
        Object obj74 = constantDescList57.clone();
        boolean boolean75 = constantDescList31.addAll(10, (java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList57);
        constantDescList57.trimToSize();
        constantDescList57.clear();
        Object obj78 = constantDescList57.clone();
        Object obj79 = constantDescList57.clone();
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
        org.junit.Assert.assertNotNull(constantDescArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertEquals(obj74.toString(), "[]");
        org.junit.Assert.assertEquals(String.valueOf(obj74), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj74), "[]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertEquals(obj78.toString(), "[]");
        org.junit.Assert.assertEquals(String.valueOf(obj78), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj78), "[]");
        org.junit.Assert.assertNotNull(obj79);
        org.junit.Assert.assertEquals(obj79.toString(), "[]");
        org.junit.Assert.assertEquals(String.valueOf(obj79), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj79), "[]");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        java.lang.constant.ConstantDesc[] constantDescArray16 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList17 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList17, constantDescArray16);
        String str19 = constantDescList17.toString();
        java.lang.constant.ConstantDesc constantDesc22 = constantDescList17.set(3, (java.lang.constant.ConstantDesc) 1.0d);
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList24 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) (byte) 100);
        Class<?> wildcardClass25 = constantDescList24.getClass();
        boolean boolean26 = constantDescList17.remove((Object) wildcardClass25);
        java.lang.constant.ConstantDesc[] constantDescArray35 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList36 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList36, constantDescArray35);
        int int39 = constantDescList36.lastIndexOf((Object) 1L);
        constantDescList36.ensureCapacity(10);
        Object obj42 = constantDescList36.clone();
        constantDescList36.ensureCapacity(4);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor45 = constantDescList36.iterator();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList46 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList36);
        boolean boolean47 = constantDescList17.contains((Object) constantDescList46);
        org.junit.Assert.assertNotNull(constantDescArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str19, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals("'" + constantDesc22 + "' != '" + 10L + "'", constantDesc22, 10L);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(constantDescArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertEquals(obj42.toString(), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj42), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj42), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertNotNull(constantDescItor45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
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
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList55 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList51);
        java.util.ListIterator<java.lang.constant.ConstantDesc> constantDescItor56 = constantDescList51.listIterator();
        constantDescList51.ensureCapacity((int) (byte) 1);
        boolean boolean60 = constantDescList51.add((java.lang.constant.ConstantDesc) (-1.0d));
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList62 = new java.util.ArrayList<java.lang.constant.ConstantDesc>(3);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream63 = constantDescList62.parallelStream();
        int int64 = constantDescList51.indexOf((Object) constantDescStream63);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream65 = constantDescList51.stream();
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
        org.junit.Assert.assertNotNull(constantDescItor56);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(constantDescStream63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(constantDescStream65);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList0 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        constantDescList0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.lang.constant.ConstantDesc> constantDescItor3 = constantDescList0.listIterator(24);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 24, Size: 0");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
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
        java.util.ListIterator<java.lang.constant.ConstantDesc> constantDescItor51 = constantDescList31.listIterator((int) (byte) 0);
        Object obj52 = constantDescList31.clone();
        int int53 = constantDescList31.size();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList54 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList31);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor55 = constantDescList31.iterator();
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
        org.junit.Assert.assertNotNull(constantDescItor51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals(obj52.toString(), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(String.valueOf(obj52), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj52), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 16 + "'", int53 == 16);
        org.junit.Assert.assertNotNull(constantDescItor55);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList1 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc[] constantDescArray10 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList11 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList11, constantDescArray10);
        int int14 = constantDescList11.lastIndexOf((Object) 1L);
        constantDescList11.ensureCapacity(10);
        boolean boolean17 = constantDescList1.containsAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList11);
        boolean boolean19 = constantDescList11.add((java.lang.constant.ConstantDesc) 10.0f);
        Object obj20 = null;
        int int21 = constantDescList11.indexOf(obj20);
        constantDescList11.add(1, (java.lang.constant.ConstantDesc) "[10.0, 0.0, 1, 10, 100.0, -1.0, 0.0, 1, [10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0], hi!, -1, 10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList1 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) ' ');
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream2 = constantDescList1.parallelStream();
        java.util.ListIterator<java.lang.constant.ConstantDesc> constantDescItor3 = constantDescList1.listIterator();
        Object[] objArray4 = constantDescList1.toArray();
        java.lang.constant.ConstantDesc[] constantDescArray22 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList23 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList23, constantDescArray22);
        String str25 = constantDescList23.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream26 = constantDescList23.parallelStream();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator27 = constantDescList23.spliterator();
        java.lang.constant.ConstantDesc[] constantDescArray36 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList37 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList37, constantDescArray36);
        int int40 = constantDescList37.lastIndexOf((Object) 1L);
        constantDescList37.ensureCapacity(10);
        Object obj43 = constantDescList37.clone();
        boolean boolean44 = constantDescList23.contains((Object) constantDescList37);
        java.lang.constant.ConstantDesc constantDesc46 = constantDescList23.get((int) (short) 10);
        java.lang.constant.ConstantDesc constantDesc49 = constantDescList23.set((int) (short) 1, (java.lang.constant.ConstantDesc) (-1.0f));
        int int51 = constantDescList23.lastIndexOf((Object) "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        boolean boolean52 = constantDescList1.addAll((int) (byte) 0, (java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList23);
        java.lang.constant.ConstantDesc constantDesc54 = constantDescList1.remove((int) (byte) 1);
        java.lang.constant.ConstantDesc constantDesc56 = constantDescList1.get(8);
        org.junit.Assert.assertNotNull(constantDescStream2);
        org.junit.Assert.assertNotNull(constantDescItor3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(constantDescArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str25, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream26);
        org.junit.Assert.assertNotNull(constantDescSpliterator27);
        org.junit.Assert.assertNotNull(constantDescArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertEquals(obj43.toString(), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj43), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj43), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + constantDesc46 + "' != '" + 1 + "'", constantDesc46, 1);
        org.junit.Assert.assertEquals("'" + constantDesc49 + "' != '" + 1 + "'", constantDesc49, 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + constantDesc54 + "' != '" + (-1.0f) + "'", constantDesc54, (-1.0f));
        org.junit.Assert.assertEquals("'" + constantDesc56 + "' != '" + 0L + "'", constantDesc56, 0L);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList0 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        java.lang.constant.ConstantDesc[] constantDescArray17 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList18 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList18, constantDescArray17);
        String str20 = constantDescList18.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream21 = constantDescList18.parallelStream();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator22 = constantDescList18.spliterator();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream23 = constantDescList18.parallelStream();
        boolean boolean24 = constantDescList0.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList18);
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList25 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList0);
        constantDescList25.clear();
        java.lang.constant.ConstantDesc[] constantDescArray35 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList36 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList36, constantDescArray35);
        int int39 = constantDescList36.lastIndexOf((Object) 1L);
        constantDescList36.ensureCapacity(10);
        Object[] objArray42 = constantDescList36.toArray();
        java.lang.constant.ConstantDesc constantDesc44 = constantDescList36.remove(0);
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList45 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        Object[] objArray46 = constantDescList45.toArray();
        int int47 = constantDescList45.size();
        java.util.List<java.lang.constant.ConstantDesc> constantDescList50 = constantDescList45.subList((int) (short) 0, (int) (byte) 0);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream51 = constantDescList45.stream();
        java.lang.constant.ConstantDesc[] constantDescArray60 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList61 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList61, constantDescArray60);
        int int64 = constantDescList61.lastIndexOf((Object) 1L);
        constantDescList61.ensureCapacity(10);
        Object[] objArray67 = constantDescList61.toArray();
        String str68 = constantDescList61.toString();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor69 = constantDescList61.iterator();
        boolean boolean70 = constantDescList45.contains((Object) constantDescItor69);
        int int71 = constantDescList36.indexOf((Object) constantDescItor69);
        boolean boolean72 = constantDescList25.contains((Object) int71);
        org.junit.Assert.assertNotNull(constantDescArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str20, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream21);
        org.junit.Assert.assertNotNull(constantDescSpliterator22);
        org.junit.Assert.assertNotNull(constantDescStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(constantDescArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals("'" + constantDesc44 + "' != '" + 0 + "'", constantDesc44, 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(constantDescList50);
        org.junit.Assert.assertNotNull(constantDescStream51);
        org.junit.Assert.assertNotNull(constantDescArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]" + "'", str68, "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertNotNull(constantDescItor69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList0 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        java.lang.constant.ConstantDesc[] constantDescArray17 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList18 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList18, constantDescArray17);
        String str20 = constantDescList18.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream21 = constantDescList18.parallelStream();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator22 = constantDescList18.spliterator();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream23 = constantDescList18.parallelStream();
        boolean boolean24 = constantDescList0.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList18);
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList25 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList0);
        java.lang.constant.ConstantDesc[] constantDescArray42 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList43 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList43, constantDescArray42);
        String str45 = constantDescList43.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream46 = constantDescList43.parallelStream();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator47 = constantDescList43.spliterator();
        java.lang.constant.ConstantDesc[] constantDescArray56 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList57 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList57, constantDescArray56);
        int int60 = constantDescList57.lastIndexOf((Object) 1L);
        constantDescList57.ensureCapacity(10);
        Object obj63 = constantDescList57.clone();
        boolean boolean64 = constantDescList43.contains((Object) constantDescList57);
        constantDescList43.clear();
        Object obj66 = constantDescList43.clone();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList67 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList43);
        int int68 = constantDescList0.lastIndexOf((Object) constantDescList67);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream69 = constantDescList0.stream();
        Object obj70 = constantDescList0.clone();
        constantDescList0.clear();
        org.junit.Assert.assertNotNull(constantDescArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str20, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream21);
        org.junit.Assert.assertNotNull(constantDescSpliterator22);
        org.junit.Assert.assertNotNull(constantDescStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(constantDescArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str45, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream46);
        org.junit.Assert.assertNotNull(constantDescSpliterator47);
        org.junit.Assert.assertNotNull(constantDescArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertEquals(obj63.toString(), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj63), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj63), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertEquals(obj66.toString(), "[]");
        org.junit.Assert.assertEquals(String.valueOf(obj66), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj66), "[]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(constantDescStream69);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertEquals(obj70.toString(), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(String.valueOf(obj70), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj70), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList0 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        Object[] objArray1 = constantDescList0.toArray();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList3 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) ' ');
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream4 = constantDescList3.parallelStream();
        java.util.ListIterator<java.lang.constant.ConstantDesc> constantDescItor5 = constantDescList3.listIterator();
        boolean boolean6 = constantDescList0.remove((Object) constantDescItor5);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator7 = constantDescList0.spliterator();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList10 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) (byte) 100);
        Object obj11 = constantDescList10.clone();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator12 = constantDescList10.spliterator();
        boolean boolean13 = constantDescList0.addAll((int) (byte) 0, (java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList10);
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList15 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc[] constantDescArray24 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList25 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList25, constantDescArray24);
        int int28 = constantDescList25.lastIndexOf((Object) 1L);
        constantDescList25.ensureCapacity(10);
        boolean boolean31 = constantDescList15.containsAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList25);
        boolean boolean33 = constantDescList25.add((java.lang.constant.ConstantDesc) 10.0f);
        constantDescList25.trimToSize();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList35 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList25);
        java.lang.constant.ConstantDesc constantDesc38 = constantDescList25.set(0, (java.lang.constant.ConstantDesc) 5);
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList40 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) ' ');
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream41 = constantDescList40.parallelStream();
        java.util.ListIterator<java.lang.constant.ConstantDesc> constantDescItor42 = constantDescList40.listIterator();
        String str43 = constantDescList40.toString();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList45 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) (byte) 100);
        Object obj46 = constantDescList45.clone();
        Object obj47 = constantDescList45.clone();
        boolean boolean48 = constantDescList40.contains(obj47);
        java.util.ListIterator<java.lang.constant.ConstantDesc> constantDescItor50 = constantDescList40.listIterator(0);
        int int51 = constantDescList25.lastIndexOf((Object) constantDescList40);
        java.util.ListIterator<java.lang.constant.ConstantDesc> constantDescItor52 = constantDescList25.listIterator();
        int int53 = constantDescList0.lastIndexOf((Object) constantDescList25);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(constantDescStream4);
        org.junit.Assert.assertNotNull(constantDescItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(constantDescSpliterator7);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "[]");
        org.junit.Assert.assertEquals(String.valueOf(obj11), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "[]");
        org.junit.Assert.assertNotNull(constantDescSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(constantDescArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + constantDesc38 + "' != '" + 0 + "'", constantDesc38, 0);
        org.junit.Assert.assertNotNull(constantDescStream41);
        org.junit.Assert.assertNotNull(constantDescItor42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "[]" + "'", str43, "[]");
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertEquals(obj46.toString(), "[]");
        org.junit.Assert.assertEquals(String.valueOf(obj46), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj46), "[]");
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertEquals(obj47.toString(), "[]");
        org.junit.Assert.assertEquals(String.valueOf(obj47), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj47), "[]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(constantDescItor50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(constantDescItor52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList1 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc[] constantDescArray18 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList19 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList19, constantDescArray18);
        String str21 = constantDescList19.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream22 = constantDescList19.parallelStream();
        int int23 = constantDescList1.lastIndexOf((Object) constantDescList19);
        java.util.ArrayList<CharSequence> charSequenceList25 = new java.util.ArrayList<CharSequence>(2);
        boolean boolean26 = constantDescList1.contains((Object) charSequenceList25);
        org.junit.Assert.assertNotNull(constantDescArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str21, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
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
        constantDescList17.ensureCapacity((int) (byte) 100);
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
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList1 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Capacity: -1");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        String str31 = constantDescList19.toString();
        Object[] objArray32 = constantDescList19.toArray();
        java.lang.constant.ConstantDesc[] constantDescArray34 = new java.lang.constant.ConstantDesc[] { 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList35 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList35, constantDescArray34);
        java.lang.constant.ConstantDesc constantDesc38 = null;
        java.lang.constant.ConstantDesc constantDesc39 = constantDescList35.set(0, constantDesc38);
        Object[] objArray40 = constantDescList35.toArray();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList41 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        Object[] objArray42 = constantDescList41.toArray();
        boolean boolean43 = constantDescList35.remove((Object) constantDescList41);
        Object[] objArray44 = constantDescList41.toArray();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor45 = constantDescList41.iterator();
        int int46 = constantDescList19.indexOf((Object) constantDescList41);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.lang.constant.ConstantDesc> constantDescItor48 = constantDescList19.listIterator((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 16");
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str31, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + constantDesc39 + "' != '" + 0L + "'", constantDesc39, 0L);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[null]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
        org.junit.Assert.assertNotNull(constantDescItor45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList1 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) (short) 1);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream2 = constantDescList1.stream();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator3 = constantDescList1.spliterator();
        String str4 = constantDescList1.toString();
        org.junit.Assert.assertNotNull(constantDescStream2);
        org.junit.Assert.assertNotNull(constantDescSpliterator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
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
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList41 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        java.lang.constant.ConstantDesc[] constantDescArray58 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList59 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList59, constantDescArray58);
        String str61 = constantDescList59.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream62 = constantDescList59.parallelStream();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator63 = constantDescList59.spliterator();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream64 = constantDescList59.parallelStream();
        boolean boolean65 = constantDescList41.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList59);
        constantDescList59.trimToSize();
        int int67 = constantDescList17.lastIndexOf((Object) constantDescList59);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream68 = constantDescList59.parallelStream();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList69 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        Object[] objArray70 = constantDescList69.toArray();
        boolean boolean71 = constantDescList69.isEmpty();
        int int72 = constantDescList69.size();
        constantDescList69.clear();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList75 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) ' ');
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream76 = constantDescList75.parallelStream();
        boolean boolean77 = constantDescList69.remove((Object) constantDescStream76);
        int int78 = constantDescList59.indexOf((Object) constantDescStream76);
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
        org.junit.Assert.assertNotNull(constantDescArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str61, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream62);
        org.junit.Assert.assertNotNull(constantDescSpliterator63);
        org.junit.Assert.assertNotNull(constantDescStream64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(constantDescStream68);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(constantDescStream76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        java.lang.constant.ConstantDesc[] constantDescArray16 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList17 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList17, constantDescArray16);
        String str19 = constantDescList17.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream20 = constantDescList17.parallelStream();
        java.lang.constant.ConstantDesc constantDesc23 = constantDescList17.set((int) (byte) 1, (java.lang.constant.ConstantDesc) 10.0f);
        String str24 = constantDescList17.toString();
        java.lang.constant.ConstantDesc[] constantDescArray36 = new java.lang.constant.ConstantDesc[] { 10.0f, 0.0d, 1, 10, 100.0f, (-1.0d), 0.0d, 1, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]", "hi!", (-1) };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList37 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList37, constantDescArray36);
        java.lang.constant.ConstantDesc[] constantDescArray55 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList56 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList56, constantDescArray55);
        String str58 = constantDescList56.toString();
        java.lang.constant.ConstantDesc[] constantDescArray67 = new java.lang.constant.ConstantDesc[] { 100.0d, 1.0f, "hi!", 1.0f, 100, (-1), 0.0f };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList68 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList68, constantDescArray67);
        Object obj70 = constantDescList68.clone();
        Object[] objArray71 = new Object[] { 'a', constantDescList68 };
        Object[] objArray72 = constantDescList56.toArray(objArray71);
        int int73 = constantDescList56.size();
        boolean boolean74 = constantDescList37.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList56);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream75 = constantDescList56.stream();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList76 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        Object[] objArray77 = constantDescList76.toArray();
        boolean boolean78 = constantDescList76.isEmpty();
        boolean boolean79 = constantDescList56.containsAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList76);
        boolean boolean80 = constantDescList17.retainAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList56);
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList81 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList17);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream82 = constantDescList81.stream();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc84 = constantDescList81.remove(27);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 27 out of bounds for length 16");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str19, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream20);
        org.junit.Assert.assertEquals("'" + constantDesc23 + "' != '" + 1 + "'", constantDesc23, 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[10, 10.0, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str24, "[10, 10.0, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(constantDescArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str58, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertEquals(obj70.toString(), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj70), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj70), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 16 + "'", int73 == 16);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(constantDescStream75);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(constantDescStream82);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        java.lang.constant.ConstantDesc[] constantDescArray8 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList9 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList9, constantDescArray8);
        int int12 = constantDescList9.lastIndexOf((Object) 1L);
        constantDescList9.ensureCapacity(10);
        Object[] objArray15 = constantDescList9.toArray();
        Object[] objArray16 = constantDescList9.toArray();
        java.util.ListIterator<java.lang.constant.ConstantDesc> constantDescItor18 = constantDescList9.listIterator((int) (short) 1);
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList19 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        Object[] objArray20 = constantDescList19.toArray();
        int int21 = constantDescList19.size();
        java.util.List<java.lang.constant.ConstantDesc> constantDescList24 = constantDescList19.subList((int) (short) 0, (int) (byte) 0);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream25 = constantDescList19.stream();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor26 = constantDescList19.iterator();
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
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream77 = constantDescList58.stream();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList78 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        Object[] objArray79 = constantDescList78.toArray();
        boolean boolean80 = constantDescList78.isEmpty();
        boolean boolean81 = constantDescList58.containsAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList78);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream82 = constantDescList58.stream();
        int int83 = constantDescList58.size();
        boolean boolean84 = constantDescList19.contains((Object) constantDescList58);
        boolean boolean85 = constantDescList9.contains((Object) boolean84);
        String str86 = constantDescList9.toString();
        org.junit.Assert.assertNotNull(constantDescArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertNotNull(constantDescItor18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(constantDescList24);
        org.junit.Assert.assertNotNull(constantDescStream25);
        org.junit.Assert.assertNotNull(constantDescItor26);
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
        org.junit.Assert.assertNotNull(constantDescStream77);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray79), "[]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(constantDescStream82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 16 + "'", int83 == 16);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]" + "'", str86, "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList1 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) (byte) 100);
        Object obj2 = constantDescList1.clone();
        constantDescList1.trimToSize();
        java.lang.constant.ConstantDesc[] constantDescArray20 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList21 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList21, constantDescArray20);
        String str23 = constantDescList21.toString();
        constantDescList21.add(0, (java.lang.constant.ConstantDesc) (-1.0f));
        boolean boolean28 = constantDescList21.add((java.lang.constant.ConstantDesc) 16);
        java.lang.constant.ConstantDesc constantDesc30 = constantDescList21.get(10);
        boolean boolean31 = constantDescList1.containsAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList21);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "[]");
        org.junit.Assert.assertEquals(String.valueOf(obj2), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "[]");
        org.junit.Assert.assertNotNull(constantDescArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str23, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + constantDesc30 + "' != '" + 0L + "'", constantDesc30, 0L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
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
        Object obj56 = constantDescList31.clone();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream57 = constantDescList31.parallelStream();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList58 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList59 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList58);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream60 = constantDescList58.parallelStream();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList61 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList58);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream62 = constantDescList61.parallelStream();
        int int63 = constantDescList31.indexOf((Object) constantDescStream62);
        java.lang.constant.ConstantDesc[] constantDescArray80 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList81 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList81, constantDescArray80);
        String str83 = constantDescList81.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream84 = constantDescList81.parallelStream();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator85 = constantDescList81.spliterator();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream86 = constantDescList81.parallelStream();
        boolean boolean88 = constantDescList81.add((java.lang.constant.ConstantDesc) 0.0d);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor89 = constantDescList81.iterator();
        constantDescList81.clear();
        boolean boolean92 = constantDescList81.add((java.lang.constant.ConstantDesc) 1.0f);
        Object[] objArray93 = constantDescList81.toArray();
        boolean boolean94 = constantDescList31.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList81);
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
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertEquals(obj56.toString(), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(String.valueOf(obj56), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj56), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream57);
        org.junit.Assert.assertNotNull(constantDescStream60);
        org.junit.Assert.assertNotNull(constantDescStream62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(constantDescArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str83, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream84);
        org.junit.Assert.assertNotNull(constantDescSpliterator85);
        org.junit.Assert.assertNotNull(constantDescStream86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(constantDescItor89);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(objArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray93), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray93), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
        boolean boolean36 = constantDescList17.add((java.lang.constant.ConstantDesc) "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray53 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList54 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList54, constantDescArray53);
        String str56 = constantDescList54.toString();
        java.lang.constant.ConstantDesc[] constantDescArray65 = new java.lang.constant.ConstantDesc[] { 100.0d, 1.0f, "hi!", 1.0f, 100, (-1), 0.0f };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList66 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList66, constantDescArray65);
        Object obj68 = constantDescList66.clone();
        Object[] objArray69 = new Object[] { 'a', constantDescList66 };
        Object[] objArray70 = constantDescList54.toArray(objArray69);
        int int71 = constantDescList54.size();
        boolean boolean73 = constantDescList54.add((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean74 = constantDescList17.retainAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList54);
        constantDescList17.trimToSize();
        Object[] objArray76 = constantDescList17.toArray();
        constantDescList17.trimToSize();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(constantDescArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str56, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertEquals(obj68.toString(), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj68), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj68), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 16 + "'", int71 == 16);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0, hi!]");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList1 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) (byte) 100);
        java.lang.constant.ConstantDesc[] constantDescArray18 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList19 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList19, constantDescArray18);
        String str21 = constantDescList19.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream22 = constantDescList19.parallelStream();
        java.util.ListIterator<java.lang.constant.ConstantDesc> constantDescItor24 = constantDescList19.listIterator((int) (byte) 10);
        boolean boolean25 = constantDescList1.retainAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList19);
        Object[] objArray26 = constantDescList1.toArray();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList27 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        Object[] objArray28 = constantDescList27.toArray();
        boolean boolean29 = constantDescList27.isEmpty();
        int int30 = constantDescList27.size();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList31 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList27);
        java.lang.constant.ConstantDesc[] constantDescArray48 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList49 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList49, constantDescArray48);
        String str51 = constantDescList49.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream52 = constantDescList49.parallelStream();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator53 = constantDescList49.spliterator();
        java.lang.constant.ConstantDesc[] constantDescArray62 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList63 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList63, constantDescArray62);
        int int66 = constantDescList63.lastIndexOf((Object) 1L);
        constantDescList63.ensureCapacity(10);
        Object obj69 = constantDescList63.clone();
        boolean boolean70 = constantDescList49.contains((Object) constantDescList63);
        constantDescList49.clear();
        Object[] objArray72 = constantDescList49.toArray();
        boolean boolean73 = constantDescList31.containsAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList49);
        constantDescList31.trimToSize();
        boolean boolean75 = constantDescList1.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList31);
        String str76 = constantDescList1.toString();
        constantDescList1.trimToSize();
        org.junit.Assert.assertNotNull(constantDescArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str21, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream22);
        org.junit.Assert.assertNotNull(constantDescItor24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(constantDescArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str51, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream52);
        org.junit.Assert.assertNotNull(constantDescSpliterator53);
        org.junit.Assert.assertNotNull(constantDescArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertEquals(obj69.toString(), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj69), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj69), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "[]" + "'", str76, "[]");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
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
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList37 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) ' ');
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream38 = constantDescList37.parallelStream();
        Object obj39 = constantDescList37.clone();
        boolean boolean40 = constantDescList17.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList37);
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList42 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) ' ');
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream43 = constantDescList42.parallelStream();
        Object obj44 = constantDescList42.clone();
        boolean boolean45 = constantDescList17.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList42);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream46 = constantDescList17.parallelStream();
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
        org.junit.Assert.assertNotNull(constantDescStream38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "[]");
        org.junit.Assert.assertEquals(String.valueOf(obj39), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "[]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(constantDescStream43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertEquals(obj44.toString(), "[]");
        org.junit.Assert.assertEquals(String.valueOf(obj44), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj44), "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(constantDescStream46);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        java.lang.constant.ConstantDesc[] constantDescArray16 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList17 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList17, constantDescArray16);
        String str19 = constantDescList17.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream20 = constantDescList17.parallelStream();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator21 = constantDescList17.spliterator();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream22 = constantDescList17.parallelStream();
        constantDescList17.add(0, (java.lang.constant.ConstantDesc) (-1));
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator26 = constantDescList17.spliterator();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream27 = constantDescList17.stream();
        Class<?> wildcardClass28 = constantDescList17.getClass();
        org.junit.Assert.assertNotNull(constantDescArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str19, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream20);
        org.junit.Assert.assertNotNull(constantDescSpliterator21);
        org.junit.Assert.assertNotNull(constantDescStream22);
        org.junit.Assert.assertNotNull(constantDescSpliterator26);
        org.junit.Assert.assertNotNull(constantDescStream27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList0 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        java.lang.constant.ConstantDesc[] constantDescArray17 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList18 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList18, constantDescArray17);
        String str20 = constantDescList18.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream21 = constantDescList18.parallelStream();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator22 = constantDescList18.spliterator();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream23 = constantDescList18.parallelStream();
        boolean boolean24 = constantDescList0.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList18);
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList25 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList0);
        java.lang.constant.ConstantDesc[] constantDescArray42 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList43 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList43, constantDescArray42);
        String str45 = constantDescList43.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream46 = constantDescList43.parallelStream();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator47 = constantDescList43.spliterator();
        java.lang.constant.ConstantDesc[] constantDescArray56 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList57 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList57, constantDescArray56);
        int int60 = constantDescList57.lastIndexOf((Object) 1L);
        constantDescList57.ensureCapacity(10);
        Object obj63 = constantDescList57.clone();
        boolean boolean64 = constantDescList43.contains((Object) constantDescList57);
        constantDescList43.clear();
        Object obj66 = constantDescList43.clone();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList67 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList43);
        int int68 = constantDescList0.lastIndexOf((Object) constantDescList67);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream69 = constantDescList0.stream();
        java.lang.constant.ConstantDesc constantDesc71 = constantDescList0.remove(0);
        constantDescList0.ensureCapacity(17);
        org.junit.Assert.assertNotNull(constantDescArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str20, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream21);
        org.junit.Assert.assertNotNull(constantDescSpliterator22);
        org.junit.Assert.assertNotNull(constantDescStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(constantDescArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str45, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream46);
        org.junit.Assert.assertNotNull(constantDescSpliterator47);
        org.junit.Assert.assertNotNull(constantDescArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertEquals(obj63.toString(), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj63), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj63), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertEquals(obj66.toString(), "[]");
        org.junit.Assert.assertEquals(String.valueOf(obj66), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj66), "[]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(constantDescStream69);
        org.junit.Assert.assertEquals("'" + constantDesc71 + "' != '" + 10 + "'", constantDesc71, 10);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList0 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        Object[] objArray1 = constantDescList0.toArray();
        boolean boolean2 = constantDescList0.isEmpty();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList3 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        Object[] objArray4 = constantDescList3.toArray();
        int int5 = constantDescList3.size();
        int int6 = constantDescList0.lastIndexOf((Object) int5);
        java.lang.constant.ConstantDesc[] constantDescArray24 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList25 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList25, constantDescArray24);
        String str27 = constantDescList25.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream28 = constantDescList25.parallelStream();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator29 = constantDescList25.spliterator();
        java.lang.constant.ConstantDesc[] constantDescArray38 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList39 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList39, constantDescArray38);
        int int42 = constantDescList39.lastIndexOf((Object) 1L);
        constantDescList39.ensureCapacity(10);
        Object obj45 = constantDescList39.clone();
        boolean boolean46 = constantDescList25.contains((Object) constantDescList39);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator47 = constantDescList25.spliterator();
        boolean boolean49 = constantDescList25.add((java.lang.constant.ConstantDesc) 100.0f);
        boolean boolean50 = constantDescList0.addAll(0, (java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList25);
        constantDescList25.trimToSize();
        java.util.ArrayList<Object> objList52 = new java.util.ArrayList<Object>((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList25);
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList53 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList25);
        String str54 = constantDescList25.toString();
        java.lang.constant.ConstantDesc constantDesc55 = null;
        boolean boolean56 = constantDescList25.add(constantDesc55);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(constantDescArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str27, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream28);
        org.junit.Assert.assertNotNull(constantDescSpliterator29);
        org.junit.Assert.assertNotNull(constantDescArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj45), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(constantDescSpliterator47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0, 100.0]" + "'", str54, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        java.lang.constant.ConstantDesc[] constantDescArray16 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList17 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList17, constantDescArray16);
        String str19 = constantDescList17.toString();
        constantDescList17.add(0, (java.lang.constant.ConstantDesc) (-1.0f));
        boolean boolean24 = constantDescList17.add((java.lang.constant.ConstantDesc) 16);
        java.lang.constant.ConstantDesc constantDesc26 = constantDescList17.get(10);
        String str27 = constantDescList17.toString();
        constantDescList17.ensureCapacity(10);
        org.junit.Assert.assertNotNull(constantDescArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str19, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + constantDesc26 + "' != '" + 0L + "'", constantDesc26, 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[-1.0, 10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0, 16]" + "'", str27, "[-1.0, 10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0, 16]");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList57 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc[] constantDescArray66 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList67 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList67, constantDescArray66);
        int int70 = constantDescList67.lastIndexOf((Object) 1L);
        constantDescList67.ensureCapacity(10);
        boolean boolean73 = constantDescList57.containsAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList67);
        Object obj74 = constantDescList57.clone();
        boolean boolean75 = constantDescList31.addAll(10, (java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList57);
        constantDescList57.clear();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList79 = new java.util.ArrayList<java.lang.constant.ConstantDesc>(16);
        boolean boolean80 = constantDescList57.addAll((int) (byte) 0, (java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList79);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator81 = constantDescList79.spliterator();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor82 = constantDescList79.iterator();
        Object obj83 = constantDescList79.clone();
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
        org.junit.Assert.assertNotNull(constantDescArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertEquals(obj74.toString(), "[]");
        org.junit.Assert.assertEquals(String.valueOf(obj74), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj74), "[]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(constantDescSpliterator81);
        org.junit.Assert.assertNotNull(constantDescItor82);
        org.junit.Assert.assertNotNull(obj83);
        org.junit.Assert.assertEquals(obj83.toString(), "[]");
        org.junit.Assert.assertEquals(String.valueOf(obj83), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj83), "[]");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList1 = new java.util.ArrayList<java.lang.constant.ConstantDesc>(10);
        String str2 = constantDescList1.toString();
        Object[] objArray3 = constantDescList1.toArray();
        Object[] objArray4 = constantDescList1.toArray();
        String str5 = constantDescList1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList1 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) ' ');
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream2 = constantDescList1.parallelStream();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList4 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc[] constantDescArray13 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList14 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList14, constantDescArray13);
        int int17 = constantDescList14.lastIndexOf((Object) 1L);
        constantDescList14.ensureCapacity(10);
        boolean boolean20 = constantDescList4.containsAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList14);
        boolean boolean21 = constantDescList1.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList4);
        boolean boolean22 = constantDescList4.isEmpty();
        org.junit.Assert.assertNotNull(constantDescStream2);
        org.junit.Assert.assertNotNull(constantDescArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        java.lang.constant.ConstantDesc[] constantDescArray1 = new java.lang.constant.ConstantDesc[] { 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList2 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList2, constantDescArray1);
        java.lang.constant.ConstantDesc constantDesc5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = constantDescList2.set(0, constantDesc5);
        Object[] objArray7 = constantDescList2.toArray();
        constantDescList2.add((int) (byte) 1, (java.lang.constant.ConstantDesc) 2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc12 = constantDescList2.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + constantDesc6 + "' != '" + 0L + "'", constantDesc6, 0L);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
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
        java.lang.constant.ConstantDesc[] constantDescArray45 = new java.lang.constant.ConstantDesc[] { 10.0f, 0.0d, 1, 10, 100.0f, (-1.0d), 0.0d, 1, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]", "hi!", (-1) };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList46 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList46, constantDescArray45);
        java.lang.constant.ConstantDesc[] constantDescArray64 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList65 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList65, constantDescArray64);
        String str67 = constantDescList65.toString();
        java.lang.constant.ConstantDesc[] constantDescArray76 = new java.lang.constant.ConstantDesc[] { 100.0d, 1.0f, "hi!", 1.0f, 100, (-1), 0.0f };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList77 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList77, constantDescArray76);
        Object obj79 = constantDescList77.clone();
        Object[] objArray80 = new Object[] { 'a', constantDescList77 };
        Object[] objArray81 = constantDescList65.toArray(objArray80);
        int int82 = constantDescList65.size();
        boolean boolean83 = constantDescList46.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList65);
        Object obj84 = constantDescList65.clone();
        boolean boolean85 = constantDescList17.containsAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList65);
        Object obj86 = constantDescList17.clone();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor87 = constantDescList17.iterator();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator88 = constantDescList17.spliterator();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream89 = constantDescList17.parallelStream();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList91 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) (byte) 100);
        Object obj92 = constantDescList91.clone();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator93 = constantDescList91.spliterator();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream94 = constantDescList91.parallelStream();
        boolean boolean95 = constantDescList17.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList91);
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList96 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList91);
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
        org.junit.Assert.assertNotNull(constantDescArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(constantDescArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str67, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(obj79);
        org.junit.Assert.assertEquals(obj79.toString(), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj79), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj79), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray81), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray81), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 16 + "'", int82 == 16);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(obj84);
        org.junit.Assert.assertEquals(obj84.toString(), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(String.valueOf(obj84), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj84), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(obj86);
        org.junit.Assert.assertEquals(obj86.toString(), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(String.valueOf(obj86), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj86), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescItor87);
        org.junit.Assert.assertNotNull(constantDescSpliterator88);
        org.junit.Assert.assertNotNull(constantDescStream89);
        org.junit.Assert.assertNotNull(obj92);
        org.junit.Assert.assertEquals(obj92.toString(), "[]");
        org.junit.Assert.assertEquals(String.valueOf(obj92), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj92), "[]");
        org.junit.Assert.assertNotNull(constantDescSpliterator93);
        org.junit.Assert.assertNotNull(constantDescStream94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc52 = constantDescList12.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 27");
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
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
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
        java.lang.constant.ConstantDesc constantDesc41 = constantDescList17.set(2, (java.lang.constant.ConstantDesc) 10);
        boolean boolean43 = constantDescList17.add((java.lang.constant.ConstantDesc) 100.0f);
        constantDescList17.clear();
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
        org.junit.Assert.assertEquals("'" + constantDesc41 + "' != '" + 10.0f + "'", constantDesc41, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        java.lang.constant.ConstantDesc[] constantDescArray16 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList17 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList17, constantDescArray16);
        String str19 = constantDescList17.toString();
        constantDescList17.add(0, (java.lang.constant.ConstantDesc) (-1.0f));
        boolean boolean24 = constantDescList17.add((java.lang.constant.ConstantDesc) 16);
        java.lang.constant.ConstantDesc constantDesc26 = constantDescList17.get(10);
        java.lang.constant.ConstantDesc[] constantDescArray30 = new java.lang.constant.ConstantDesc[] { 1L, 10, (-1.0f) };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList31 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList31, constantDescArray30);
        java.lang.constant.ConstantDesc[] constantDescArray44 = new java.lang.constant.ConstantDesc[] { 10.0f, 0.0d, 1, 10, 100.0f, (-1.0d), 0.0d, 1, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]", "hi!", (-1) };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList45 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList45, constantDescArray44);
        java.lang.constant.ConstantDesc[] constantDescArray63 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList64 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList64, constantDescArray63);
        String str66 = constantDescList64.toString();
        java.lang.constant.ConstantDesc[] constantDescArray75 = new java.lang.constant.ConstantDesc[] { 100.0d, 1.0f, "hi!", 1.0f, 100, (-1), 0.0f };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList76 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList76, constantDescArray75);
        Object obj78 = constantDescList76.clone();
        Object[] objArray79 = new Object[] { 'a', constantDescList76 };
        Object[] objArray80 = constantDescList64.toArray(objArray79);
        int int81 = constantDescList64.size();
        boolean boolean82 = constantDescList45.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList64);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream83 = constantDescList64.stream();
        boolean boolean84 = constantDescList31.containsAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList64);
        boolean boolean85 = constantDescList17.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList64);
        java.lang.constant.ConstantDesc constantDesc87 = constantDescList17.get(0);
        org.junit.Assert.assertNotNull(constantDescArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str19, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + constantDesc26 + "' != '" + 0L + "'", constantDesc26, 0L);
        org.junit.Assert.assertNotNull(constantDescArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(constantDescArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(constantDescArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str66, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertEquals(obj78.toString(), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj78), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj78), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray79), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 16 + "'", int81 == 16);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(constantDescStream83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertEquals("'" + constantDesc87 + "' != '" + (-1.0f) + "'", constantDesc87, (-1.0f));
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        java.lang.constant.ConstantDesc[] constantDescArray16 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList17 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList17, constantDescArray16);
        String str19 = constantDescList17.toString();
        constantDescList17.add(0, (java.lang.constant.ConstantDesc) (-1.0f));
        boolean boolean24 = constantDescList17.add((java.lang.constant.ConstantDesc) 16);
        java.lang.constant.ConstantDesc constantDesc26 = constantDescList17.get(10);
        constantDescList17.clear();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream28 = constantDescList17.parallelStream();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList29 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList17);
        java.lang.constant.ConstantDesc[] constantDescArray41 = new java.lang.constant.ConstantDesc[] { 10.0f, 0.0d, 1, 10, 100.0f, (-1.0d), 0.0d, 1, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]", "hi!", (-1) };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList42 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList42, constantDescArray41);
        java.lang.constant.ConstantDesc[] constantDescArray60 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList61 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList61, constantDescArray60);
        String str63 = constantDescList61.toString();
        java.lang.constant.ConstantDesc[] constantDescArray72 = new java.lang.constant.ConstantDesc[] { 100.0d, 1.0f, "hi!", 1.0f, 100, (-1), 0.0f };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList73 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList73, constantDescArray72);
        Object obj75 = constantDescList73.clone();
        Object[] objArray76 = new Object[] { 'a', constantDescList73 };
        Object[] objArray77 = constantDescList61.toArray(objArray76);
        int int78 = constantDescList61.size();
        boolean boolean79 = constantDescList42.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList61);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream80 = constantDescList61.stream();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList81 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        Object[] objArray82 = constantDescList81.toArray();
        boolean boolean83 = constantDescList81.isEmpty();
        boolean boolean84 = constantDescList61.containsAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList81);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream85 = constantDescList61.stream();
        Object obj86 = constantDescList61.clone();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream87 = constantDescList61.parallelStream();
        boolean boolean88 = constantDescList29.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList61);
        constantDescList61.clear();
        org.junit.Assert.assertNotNull(constantDescArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str19, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + constantDesc26 + "' != '" + 0L + "'", constantDesc26, 0L);
        org.junit.Assert.assertNotNull(constantDescStream28);
        org.junit.Assert.assertNotNull(constantDescArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(constantDescArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str63, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(obj75);
        org.junit.Assert.assertEquals(obj75.toString(), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj75), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj75), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 16 + "'", int78 == 16);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(constantDescStream80);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray82), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray82), "[]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(constantDescStream85);
        org.junit.Assert.assertNotNull(obj86);
        org.junit.Assert.assertEquals(obj86.toString(), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(String.valueOf(obj86), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj86), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
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
        boolean boolean36 = constantDescList17.add((java.lang.constant.ConstantDesc) "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray53 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList54 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList54, constantDescArray53);
        String str56 = constantDescList54.toString();
        java.lang.constant.ConstantDesc[] constantDescArray65 = new java.lang.constant.ConstantDesc[] { 100.0d, 1.0f, "hi!", 1.0f, 100, (-1), 0.0f };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList66 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList66, constantDescArray65);
        Object obj68 = constantDescList66.clone();
        Object[] objArray69 = new Object[] { 'a', constantDescList66 };
        Object[] objArray70 = constantDescList54.toArray(objArray69);
        int int71 = constantDescList54.size();
        boolean boolean73 = constantDescList54.add((java.lang.constant.ConstantDesc) "hi!");
        boolean boolean74 = constantDescList17.retainAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList54);
        constantDescList17.ensureCapacity(2);
        constantDescList17.add(3, (java.lang.constant.ConstantDesc) 100.0d);
        java.lang.constant.ConstantDesc constantDesc81 = constantDescList17.get(1);
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(constantDescArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str56, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertEquals(obj68.toString(), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj68), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj68), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 16 + "'", int71 == 16);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + constantDesc81 + "' != '" + 1 + "'", constantDesc81, 1);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
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
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor56 = constantDescList31.iterator();
        int int58 = constantDescList31.indexOf((Object) 27);
        java.lang.constant.ConstantDesc[] constantDescArray75 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList76 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList76, constantDescArray75);
        String str78 = constantDescList76.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream79 = constantDescList76.parallelStream();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList80 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        Object[] objArray81 = constantDescList80.toArray();
        boolean boolean82 = constantDescList80.isEmpty();
        int int83 = constantDescList80.size();
        boolean boolean84 = constantDescList76.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList80);
        java.lang.constant.ConstantDesc constantDesc86 = constantDescList76.get(8);
        boolean boolean87 = constantDescList31.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList76);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.lang.constant.ConstantDesc> constantDescItor89 = constantDescList31.listIterator((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 32");
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
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(constantDescStream55);
        org.junit.Assert.assertNotNull(constantDescItor56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(constantDescArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str78, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream79);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray81), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray81), "[]");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + constantDesc86 + "' != '" + 0 + "'", constantDesc86, 0);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList1 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) (short) 1);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream2 = constantDescList1.stream();
        constantDescList1.ensureCapacity(4);
        java.util.ArrayList<CharSequence[]> charSequenceArrayList6 = new java.util.ArrayList<CharSequence[]>(16);
        int int7 = constantDescList1.indexOf((Object) 16);
        java.lang.constant.ConstantDesc[] constantDescArray19 = new java.lang.constant.ConstantDesc[] { 10.0f, 0.0d, 1, 10, 100.0f, (-1.0d), 0.0d, 1, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]", "hi!", (-1) };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList20 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList20, constantDescArray19);
        java.lang.constant.ConstantDesc[] constantDescArray38 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList39 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList39, constantDescArray38);
        String str41 = constantDescList39.toString();
        java.lang.constant.ConstantDesc[] constantDescArray50 = new java.lang.constant.ConstantDesc[] { 100.0d, 1.0f, "hi!", 1.0f, 100, (-1), 0.0f };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList51 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList51, constantDescArray50);
        Object obj53 = constantDescList51.clone();
        Object[] objArray54 = new Object[] { 'a', constantDescList51 };
        Object[] objArray55 = constantDescList39.toArray(objArray54);
        int int56 = constantDescList39.size();
        boolean boolean57 = constantDescList20.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList39);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream58 = constantDescList39.stream();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList59 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        Object[] objArray60 = constantDescList59.toArray();
        boolean boolean61 = constantDescList59.isEmpty();
        boolean boolean62 = constantDescList39.containsAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList59);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream63 = constantDescList39.stream();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor64 = constantDescList39.iterator();
        int int66 = constantDescList39.indexOf((Object) 27);
        java.lang.constant.ConstantDesc[] constantDescArray83 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList84 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList84, constantDescArray83);
        String str86 = constantDescList84.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream87 = constantDescList84.parallelStream();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList88 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        Object[] objArray89 = constantDescList88.toArray();
        boolean boolean90 = constantDescList88.isEmpty();
        int int91 = constantDescList88.size();
        boolean boolean92 = constantDescList84.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList88);
        java.lang.constant.ConstantDesc constantDesc94 = constantDescList84.get(8);
        boolean boolean95 = constantDescList39.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList84);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream96 = constantDescList39.parallelStream();
        boolean boolean97 = constantDescList1.containsAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList39);
        boolean boolean99 = constantDescList39.add((java.lang.constant.ConstantDesc) "[-1.0]");
        org.junit.Assert.assertNotNull(constantDescStream2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(constantDescArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(constantDescArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str41, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertEquals(obj53.toString(), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj53), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj53), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 16 + "'", int56 == 16);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(constantDescStream58);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(constantDescStream63);
        org.junit.Assert.assertNotNull(constantDescItor64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(constantDescArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str86, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream87);
        org.junit.Assert.assertNotNull(objArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray89), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray89), "[]");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertEquals("'" + constantDesc94 + "' != '" + 0 + "'", constantDesc94, 0);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(constantDescStream96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList1 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) (short) 1);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream2 = constantDescList1.stream();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator3 = constantDescList1.spliterator();
        constantDescList1.clear();
        java.lang.constant.ConstantDesc[] constantDescArray22 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList23 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList23, constantDescArray22);
        String str25 = constantDescList23.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream26 = constantDescList23.parallelStream();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator27 = constantDescList23.spliterator();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream28 = constantDescList23.parallelStream();
        boolean boolean30 = constantDescList23.add((java.lang.constant.ConstantDesc) 0.0d);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor31 = constantDescList23.iterator();
        java.lang.constant.ConstantDesc constantDesc33 = constantDescList23.get((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = constantDescList1.addAll(5, (java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Size: 0");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescStream2);
        org.junit.Assert.assertNotNull(constantDescSpliterator3);
        org.junit.Assert.assertNotNull(constantDescArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str25, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream26);
        org.junit.Assert.assertNotNull(constantDescSpliterator27);
        org.junit.Assert.assertNotNull(constantDescStream28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(constantDescItor31);
        org.junit.Assert.assertEquals("'" + constantDesc33 + "' != '" + 1 + "'", constantDesc33, 1);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        java.lang.constant.ConstantDesc[] constantDescArray16 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList17 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList17, constantDescArray16);
        String str19 = constantDescList17.toString();
        constantDescList17.add(0, (java.lang.constant.ConstantDesc) (-1.0f));
        boolean boolean24 = constantDescList17.add((java.lang.constant.ConstantDesc) 16);
        java.lang.constant.ConstantDesc constantDesc26 = constantDescList17.get(10);
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList27 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList17);
        org.junit.Assert.assertNotNull(constantDescArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str19, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + constantDesc26 + "' != '" + 0L + "'", constantDesc26, 0L);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        java.lang.constant.ConstantDesc[] constantDescArray8 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList9 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList9, constantDescArray8);
        int int12 = constantDescList9.lastIndexOf((Object) 1L);
        constantDescList9.ensureCapacity(10);
        boolean boolean16 = constantDescList9.remove((Object) 1L);
        java.lang.constant.ConstantDesc[] constantDescArray18 = new java.lang.constant.ConstantDesc[] { 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList19 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList19, constantDescArray18);
        java.lang.constant.ConstantDesc constantDesc22 = null;
        java.lang.constant.ConstantDesc constantDesc23 = constantDescList19.set(0, constantDesc22);
        Object[] objArray24 = constantDescList19.toArray();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList25 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        java.util.ListIterator<java.lang.constant.ConstantDesc> constantDescItor26 = constantDescList25.listIterator();
        boolean boolean27 = constantDescList19.remove((Object) constantDescList25);
        boolean boolean28 = constantDescList9.retainAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList19);
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList30 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc[] constantDescArray47 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList48 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList48, constantDescArray47);
        String str50 = constantDescList48.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream51 = constantDescList48.parallelStream();
        int int52 = constantDescList30.lastIndexOf((Object) constantDescList48);
        java.util.stream.Stream[] streamArray54 = new java.util.stream.Stream[0];
        @SuppressWarnings("unchecked")
        java.util.stream.Stream<java.lang.constant.ConstantDesc>[] constantDescStreamArray55 = (java.util.stream.Stream<java.lang.constant.ConstantDesc>[]) streamArray54;
        java.util.stream.Stream<java.lang.constant.ConstantDesc>[] constantDescStreamArray56 = constantDescList30.toArray((java.util.stream.Stream<java.lang.constant.ConstantDesc>[]) streamArray54);
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList57 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList30);
        boolean boolean58 = constantDescList19.containsAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList57);
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList59 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList60 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList59);
        int int61 = constantDescList59.size();
        constantDescList59.clear();
        boolean boolean64 = constantDescList59.equals((Object) (byte) 1);
        boolean boolean65 = constantDescList19.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList59);
        org.junit.Assert.assertNotNull(constantDescArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(constantDescArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + constantDesc23 + "' != '" + 0L + "'", constantDesc23, 0L);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[null]");
        org.junit.Assert.assertNotNull(constantDescItor26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(constantDescArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str50, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(streamArray54);
        org.junit.Assert.assertNotNull(constantDescStreamArray55);
        org.junit.Assert.assertNotNull(constantDescStreamArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList1 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc[] constantDescArray10 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList11 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList11, constantDescArray10);
        int int14 = constantDescList11.lastIndexOf((Object) 1L);
        constantDescList11.ensureCapacity(10);
        boolean boolean17 = constantDescList1.containsAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList11);
        boolean boolean19 = constantDescList11.add((java.lang.constant.ConstantDesc) 10.0f);
        constantDescList11.trimToSize();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList21 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList11);
        java.lang.constant.ConstantDesc constantDesc24 = constantDescList11.set(0, (java.lang.constant.ConstantDesc) 5);
        java.lang.constant.ConstantDesc constantDesc27 = constantDescList11.set(0, (java.lang.constant.ConstantDesc) (-1.0f));
        constantDescList11.clear();
        org.junit.Assert.assertNotNull(constantDescArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + constantDesc24 + "' != '" + 0 + "'", constantDesc24, 0);
        org.junit.Assert.assertEquals("'" + constantDesc27 + "' != '" + 5 + "'", constantDesc27, 5);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList1 = new java.util.ArrayList<java.lang.constant.ConstantDesc>(0);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator2 = constantDescList1.spliterator();
        java.lang.constant.ConstantDesc[] constantDescArray11 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList12 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList12, constantDescArray11);
        int int15 = constantDescList12.lastIndexOf((Object) 1L);
        constantDescList12.ensureCapacity(10);
        Object obj18 = constantDescList12.clone();
        constantDescList12.ensureCapacity(4);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor21 = constantDescList12.iterator();
        Object obj22 = constantDescList12.clone();
        boolean boolean23 = constantDescList12.isEmpty();
        Class<?> wildcardClass24 = constantDescList12.getClass();
        boolean boolean25 = constantDescList1.contains((Object) wildcardClass24);
        org.junit.Assert.assertNotNull(constantDescSpliterator2);
        org.junit.Assert.assertNotNull(constantDescArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj18), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertNotNull(constantDescItor21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj22), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList0 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        Object[] objArray1 = constantDescList0.toArray();
        boolean boolean2 = constantDescList0.isEmpty();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList3 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        Object[] objArray4 = constantDescList3.toArray();
        int int5 = constantDescList3.size();
        int int6 = constantDescList0.lastIndexOf((Object) int5);
        boolean boolean7 = constantDescList0.isEmpty();
        boolean boolean9 = constantDescList0.add((java.lang.constant.ConstantDesc) "[10, 1, 0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList0 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        Object[] objArray1 = constantDescList0.toArray();
        int int2 = constantDescList0.size();
        java.util.List<java.lang.constant.ConstantDesc> constantDescList5 = constantDescList0.subList((int) (short) 0, (int) (byte) 0);
        constantDescList0.ensureCapacity((int) (byte) 10);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(constantDescList5);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        java.lang.constant.ConstantDesc[] constantDescArray16 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList17 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList17, constantDescArray16);
        String str19 = constantDescList17.toString();
        java.lang.constant.ConstantDesc constantDesc22 = constantDescList17.set(0, (java.lang.constant.ConstantDesc) 10);
        boolean boolean23 = constantDescList17.isEmpty();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList25 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc[] constantDescArray34 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList35 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList35, constantDescArray34);
        int int38 = constantDescList35.lastIndexOf((Object) 1L);
        constantDescList35.ensureCapacity(10);
        boolean boolean41 = constantDescList25.containsAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList35);
        Object obj42 = constantDescList25.clone();
        boolean boolean44 = constantDescList25.add((java.lang.constant.ConstantDesc) 100L);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream45 = constantDescList25.stream();
        Object obj46 = constantDescList25.clone();
        boolean boolean47 = constantDescList17.contains(obj46);
        org.junit.Assert.assertNotNull(constantDescArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str19, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals("'" + constantDesc22 + "' != '" + 10 + "'", constantDesc22, 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(constantDescArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertEquals(obj42.toString(), "[]");
        org.junit.Assert.assertEquals(String.valueOf(obj42), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj42), "[]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(constantDescStream45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertEquals(obj46.toString(), "[100]");
        org.junit.Assert.assertEquals(String.valueOf(obj46), "[100]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj46), "[100]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList1 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) (byte) 100);
        Object obj2 = constantDescList1.clone();
        Object obj3 = constantDescList1.clone();
        Object[] objArray4 = constantDescList1.toArray();
        java.lang.constant.ConstantDesc[] constantDescArray16 = new java.lang.constant.ConstantDesc[] { 10.0f, 0.0d, 1, 10, 100.0f, (-1.0d), 0.0d, 1, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]", "hi!", (-1) };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList17 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList17, constantDescArray16);
        java.lang.constant.ConstantDesc[] constantDescArray35 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList36 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList36, constantDescArray35);
        String str38 = constantDescList36.toString();
        java.lang.constant.ConstantDesc[] constantDescArray47 = new java.lang.constant.ConstantDesc[] { 100.0d, 1.0f, "hi!", 1.0f, 100, (-1), 0.0f };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList48 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList48, constantDescArray47);
        Object obj50 = constantDescList48.clone();
        Object[] objArray51 = new Object[] { 'a', constantDescList48 };
        Object[] objArray52 = constantDescList36.toArray(objArray51);
        int int53 = constantDescList36.size();
        boolean boolean54 = constantDescList17.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList36);
        Object obj55 = constantDescList36.clone();
        boolean boolean56 = constantDescList1.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList36);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "[]");
        org.junit.Assert.assertEquals(String.valueOf(obj2), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "[]");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "[]");
        org.junit.Assert.assertEquals(String.valueOf(obj3), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(constantDescArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(constantDescArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str38, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertEquals(obj50.toString(), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj50), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj50), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 16 + "'", int53 == 16);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertEquals(obj55.toString(), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(String.valueOf(obj55), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj55), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
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
        java.lang.constant.ConstantDesc[] constantDescArray45 = new java.lang.constant.ConstantDesc[] { 10.0f, 0.0d, 1, 10, 100.0f, (-1.0d), 0.0d, 1, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]", "hi!", (-1) };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList46 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList46, constantDescArray45);
        java.lang.constant.ConstantDesc[] constantDescArray64 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList65 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList65, constantDescArray64);
        String str67 = constantDescList65.toString();
        java.lang.constant.ConstantDesc[] constantDescArray76 = new java.lang.constant.ConstantDesc[] { 100.0d, 1.0f, "hi!", 1.0f, 100, (-1), 0.0f };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList77 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList77, constantDescArray76);
        Object obj79 = constantDescList77.clone();
        Object[] objArray80 = new Object[] { 'a', constantDescList77 };
        Object[] objArray81 = constantDescList65.toArray(objArray80);
        int int82 = constantDescList65.size();
        boolean boolean83 = constantDescList46.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList65);
        Object obj84 = constantDescList65.clone();
        boolean boolean85 = constantDescList17.containsAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList65);
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList87 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) (byte) 100);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream88 = constantDescList87.stream();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList90 = new java.util.ArrayList<java.lang.constant.ConstantDesc>(10);
        String str91 = constantDescList90.toString();
        boolean boolean92 = constantDescList87.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList90);
        constantDescList87.trimToSize();
        boolean boolean94 = constantDescList17.equals((Object) constantDescList87);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream95 = constantDescList87.stream();
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
        org.junit.Assert.assertNotNull(constantDescArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(constantDescArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str67, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(obj79);
        org.junit.Assert.assertEquals(obj79.toString(), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj79), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj79), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray81), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray81), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 16 + "'", int82 == 16);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(obj84);
        org.junit.Assert.assertEquals(obj84.toString(), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(String.valueOf(obj84), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj84), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(constantDescStream88);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "[]" + "'", str91, "[]");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(constantDescStream95);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        java.lang.constant.ConstantDesc[] constantDescArray8 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList9 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList9, constantDescArray8);
        int int12 = constantDescList9.lastIndexOf((Object) 1L);
        constantDescList9.ensureCapacity(10);
        Object obj15 = constantDescList9.clone();
        constantDescList9.ensureCapacity(4);
        constantDescList9.ensureCapacity((int) (short) 100);
        org.junit.Assert.assertNotNull(constantDescArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj15), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        java.lang.constant.ConstantDesc[] constantDescArray16 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList17 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList17, constantDescArray16);
        String str19 = constantDescList17.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream20 = constantDescList17.parallelStream();
        java.lang.constant.ConstantDesc constantDesc23 = constantDescList17.set((int) (byte) 1, (java.lang.constant.ConstantDesc) 10.0f);
        String str24 = constantDescList17.toString();
        constantDescList17.ensureCapacity(5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.constant.ConstantDesc> constantDescList29 = constantDescList17.subList(16, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(16) > toIndex(-1)");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str19, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream20);
        org.junit.Assert.assertEquals("'" + constantDesc23 + "' != '" + 1 + "'", constantDesc23, 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[10, 10.0, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str24, "[10, 10.0, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
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
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList56 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean57 = constantDescList31.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList56);
        Object[] objArray58 = constantDescList31.toArray();
        java.lang.constant.ConstantDesc[] constantDescArray75 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList76 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList76, constantDescArray75);
        String str78 = constantDescList76.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream79 = constantDescList76.parallelStream();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator80 = constantDescList76.spliterator();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream81 = constantDescList76.parallelStream();
        boolean boolean83 = constantDescList76.add((java.lang.constant.ConstantDesc) 0.0d);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor84 = constantDescList76.iterator();
        Object obj85 = constantDescList76.clone();
        constantDescList76.clear();
        constantDescList76.ensureCapacity(16);
        boolean boolean89 = constantDescList31.contains((Object) 16);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream90 = constantDescList31.parallelStream();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream91 = constantDescList31.parallelStream();
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
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str78, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream79);
        org.junit.Assert.assertNotNull(constantDescSpliterator80);
        org.junit.Assert.assertNotNull(constantDescStream81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(constantDescItor84);
        org.junit.Assert.assertNotNull(obj85);
        org.junit.Assert.assertEquals(obj85.toString(), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0, 0.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj85), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj85), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(constantDescStream90);
        org.junit.Assert.assertNotNull(constantDescStream91);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        java.lang.constant.ConstantDesc[] constantDescArray16 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList17 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList17, constantDescArray16);
        String str19 = constantDescList17.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream20 = constantDescList17.parallelStream();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList21 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        Object[] objArray22 = constantDescList21.toArray();
        boolean boolean23 = constantDescList21.isEmpty();
        int int24 = constantDescList21.size();
        boolean boolean25 = constantDescList17.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList21);
        java.lang.constant.ConstantDesc constantDesc27 = constantDescList17.get(8);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor28 = constantDescList17.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.constant.ConstantDesc> constantDescList31 = constantDescList17.subList(100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 35");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str19, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + constantDesc27 + "' != '" + 0 + "'", constantDesc27, 0);
        org.junit.Assert.assertNotNull(constantDescItor28);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
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
        Object[] objArray36 = constantDescList17.toArray();
        String str37 = constantDescList17.toString();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList38 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList17);
        Object obj39 = constantDescList38.clone();
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
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str37, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(String.valueOf(obj39), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList0 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        Object[] objArray1 = constantDescList0.toArray();
        boolean boolean2 = constantDescList0.isEmpty();
        boolean boolean4 = constantDescList0.add((java.lang.constant.ConstantDesc) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.constant.ConstantDesc> constantDescList7 = constantDescList0.subList((int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        java.lang.constant.ConstantDesc[] constantDescArray16 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList17 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList17, constantDescArray16);
        String str19 = constantDescList17.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream20 = constantDescList17.parallelStream();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator21 = constantDescList17.spliterator();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream22 = constantDescList17.parallelStream();
        boolean boolean24 = constantDescList17.add((java.lang.constant.ConstantDesc) 0.0d);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor25 = constantDescList17.iterator();
        constantDescList17.clear();
        boolean boolean28 = constantDescList17.add((java.lang.constant.ConstantDesc) 1.0f);
        java.lang.constant.ConstantDesc[] constantDescArray37 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList38 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList38, constantDescArray37);
        int int41 = constantDescList38.lastIndexOf((Object) 1L);
        constantDescList38.ensureCapacity(10);
        Object obj44 = constantDescList38.clone();
        int int45 = constantDescList38.size();
        constantDescList38.trimToSize();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList48 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) (byte) 100);
        java.lang.constant.ConstantDesc[] constantDescArray65 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList66 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList66, constantDescArray65);
        String str68 = constantDescList66.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream69 = constantDescList66.parallelStream();
        java.util.ListIterator<java.lang.constant.ConstantDesc> constantDescItor71 = constantDescList66.listIterator((int) (byte) 10);
        boolean boolean72 = constantDescList48.retainAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList66);
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList74 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) ' ');
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream75 = constantDescList74.parallelStream();
        Object obj76 = constantDescList74.clone();
        boolean boolean77 = constantDescList66.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList74);
        String str78 = constantDescList66.toString();
        Object[] objArray79 = constantDescList66.toArray();
        java.lang.constant.ConstantDesc constantDesc81 = null;
        java.lang.constant.ConstantDesc constantDesc82 = constantDescList66.set(1, constantDesc81);
        boolean boolean83 = constantDescList66.isEmpty();
        boolean boolean84 = constantDescList38.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList66);
        java.util.ListIterator<java.lang.constant.ConstantDesc> constantDescItor86 = constantDescList38.listIterator((int) (byte) 0);
        boolean boolean87 = constantDescList38.isEmpty();
        boolean boolean88 = constantDescList17.containsAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList38);
        org.junit.Assert.assertNotNull(constantDescArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str19, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream20);
        org.junit.Assert.assertNotNull(constantDescSpliterator21);
        org.junit.Assert.assertNotNull(constantDescStream22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(constantDescItor25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(constantDescArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertEquals(obj44.toString(), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj44), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj44), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 8 + "'", int45 == 8);
        org.junit.Assert.assertNotNull(constantDescArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str68, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream69);
        org.junit.Assert.assertNotNull(constantDescItor71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(constantDescStream75);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertEquals(obj76.toString(), "[]");
        org.junit.Assert.assertEquals(String.valueOf(obj76), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj76), "[]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str78, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray79), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals("'" + constantDesc82 + "' != '" + 1 + "'", constantDesc82, 1);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(constantDescItor86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
        java.util.ListIterator<java.lang.constant.ConstantDesc> constantDescItor51 = constantDescList31.listIterator((int) (byte) 0);
        Object obj52 = constantDescList31.clone();
        int int53 = constantDescList31.size();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList54 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList31);
        java.util.ListIterator<java.lang.constant.ConstantDesc> constantDescItor55 = constantDescList31.listIterator();
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
        org.junit.Assert.assertNotNull(constantDescItor51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals(obj52.toString(), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(String.valueOf(obj52), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj52), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 16 + "'", int53 == 16);
        org.junit.Assert.assertNotNull(constantDescItor55);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        java.lang.constant.ConstantDesc[] constantDescArray1 = new java.lang.constant.ConstantDesc[] { 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList2 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList2, constantDescArray1);
        java.lang.constant.ConstantDesc constantDesc5 = null;
        java.lang.constant.ConstantDesc constantDesc6 = constantDescList2.set(0, constantDesc5);
        Object[] objArray7 = constantDescList2.toArray();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList9 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) (short) 1);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream10 = constantDescList9.stream();
        Object[] objArray11 = constantDescList9.toArray();
        boolean boolean12 = constantDescList2.contains((Object) constantDescList9);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor13 = constantDescList2.iterator();
        java.util.ListIterator<java.lang.constant.ConstantDesc> constantDescItor14 = constantDescList2.listIterator();
        org.junit.Assert.assertNotNull(constantDescArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + constantDesc6 + "' != '" + 0L + "'", constantDesc6, 0L);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNotNull(constantDescStream10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(constantDescItor13);
        org.junit.Assert.assertNotNull(constantDescItor14);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        java.lang.constant.ConstantDesc[] constantDescArray16 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList17 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList17, constantDescArray16);
        String str19 = constantDescList17.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream20 = constantDescList17.parallelStream();
        java.lang.constant.ConstantDesc constantDesc23 = constantDescList17.set((int) (byte) 1, (java.lang.constant.ConstantDesc) 10.0f);
        String str24 = constantDescList17.toString();
        java.lang.constant.ConstantDesc[] constantDescArray36 = new java.lang.constant.ConstantDesc[] { 10.0f, 0.0d, 1, 10, 100.0f, (-1.0d), 0.0d, 1, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]", "hi!", (-1) };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList37 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList37, constantDescArray36);
        java.lang.constant.ConstantDesc[] constantDescArray55 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList56 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList56, constantDescArray55);
        String str58 = constantDescList56.toString();
        java.lang.constant.ConstantDesc[] constantDescArray67 = new java.lang.constant.ConstantDesc[] { 100.0d, 1.0f, "hi!", 1.0f, 100, (-1), 0.0f };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList68 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList68, constantDescArray67);
        Object obj70 = constantDescList68.clone();
        Object[] objArray71 = new Object[] { 'a', constantDescList68 };
        Object[] objArray72 = constantDescList56.toArray(objArray71);
        int int73 = constantDescList56.size();
        boolean boolean74 = constantDescList37.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList56);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream75 = constantDescList56.stream();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList76 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        Object[] objArray77 = constantDescList76.toArray();
        boolean boolean78 = constantDescList76.isEmpty();
        boolean boolean79 = constantDescList56.containsAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList76);
        boolean boolean80 = constantDescList17.retainAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList56);
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList81 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList17);
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList83 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) ' ');
        constantDescList83.trimToSize();
        boolean boolean85 = constantDescList81.equals((Object) constantDescList83);
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList86 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList81);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream87 = constantDescList81.parallelStream();
        Class<?> wildcardClass88 = constantDescStream87.getClass();
        org.junit.Assert.assertNotNull(constantDescArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str19, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream20);
        org.junit.Assert.assertEquals("'" + constantDesc23 + "' != '" + 1 + "'", constantDesc23, 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[10, 10.0, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str24, "[10, 10.0, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(constantDescArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str58, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertEquals(obj70.toString(), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj70), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj70), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 16 + "'", int73 == 16);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(constantDescStream75);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(constantDescStream87);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        Object[] objArray39 = constantDescList31.toArray();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList41 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        java.lang.constant.ConstantDesc[] constantDescArray58 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList59 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList59, constantDescArray58);
        String str61 = constantDescList59.toString();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream62 = constantDescList59.parallelStream();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator63 = constantDescList59.spliterator();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream64 = constantDescList59.parallelStream();
        boolean boolean65 = constantDescList41.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList59);
        java.util.ListIterator<java.lang.constant.ConstantDesc> constantDescItor66 = constantDescList59.listIterator();
        boolean boolean67 = constantDescList31.addAll(0, (java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList59);
        constantDescList31.trimToSize();
        boolean boolean69 = constantDescList31.isEmpty();
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
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[0, 100, 100.0, 0.0, hi!, 1.0, hi!, 10.0]");
        org.junit.Assert.assertNotNull(constantDescArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str61, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescStream62);
        org.junit.Assert.assertNotNull(constantDescSpliterator63);
        org.junit.Assert.assertNotNull(constantDescStream64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(constantDescItor66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList1 = new java.util.ArrayList<java.lang.constant.ConstantDesc>(10);
        String str2 = constantDescList1.toString();
        Object[] objArray3 = constantDescList1.toArray();
        Object[] objArray4 = constantDescList1.toArray();
        constantDescList1.ensureCapacity(0);
        java.lang.constant.ConstantDesc[] constantDescArray18 = new java.lang.constant.ConstantDesc[] { 10.0f, 0.0d, 1, 10, 100.0f, (-1.0d), 0.0d, 1, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]", "hi!", (-1) };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList19 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList19, constantDescArray18);
        java.lang.constant.ConstantDesc[] constantDescArray37 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList38 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList38, constantDescArray37);
        String str40 = constantDescList38.toString();
        java.lang.constant.ConstantDesc[] constantDescArray49 = new java.lang.constant.ConstantDesc[] { 100.0d, 1.0f, "hi!", 1.0f, 100, (-1), 0.0f };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList50 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList50, constantDescArray49);
        Object obj52 = constantDescList50.clone();
        Object[] objArray53 = new Object[] { 'a', constantDescList50 };
        Object[] objArray54 = constantDescList38.toArray(objArray53);
        int int55 = constantDescList38.size();
        boolean boolean56 = constantDescList19.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList38);
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList58 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) ' ');
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream59 = constantDescList58.parallelStream();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList61 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((int) ' ');
        java.lang.constant.ConstantDesc[] constantDescArray70 = new java.lang.constant.ConstantDesc[] { 0, 100L, 100.0d, 0.0d, "hi!", 1.0d, "hi!", 10.0d };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList71 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList71, constantDescArray70);
        int int74 = constantDescList71.lastIndexOf((Object) 1L);
        constantDescList71.ensureCapacity(10);
        boolean boolean77 = constantDescList61.containsAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList71);
        boolean boolean78 = constantDescList58.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList61);
        boolean boolean79 = constantDescList19.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList61);
        java.util.ListIterator<java.lang.constant.ConstantDesc> constantDescItor80 = constantDescList19.listIterator();
        Object obj81 = constantDescList19.clone();
        constantDescList19.clear();
        int int83 = constantDescList1.indexOf((Object) constantDescList19);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(constantDescArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(constantDescArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str40, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals(obj52.toString(), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj52), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj52), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 16 + "'", int55 == 16);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(constantDescStream59);
        org.junit.Assert.assertNotNull(constantDescArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(constantDescItor80);
        org.junit.Assert.assertNotNull(obj81);
        org.junit.Assert.assertEquals(obj81.toString(), "[10.0, 0.0, 1, 10, 100.0, -1.0, 0.0, 1, [10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0], hi!, -1, 10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(String.valueOf(obj81), "[10.0, 0.0, 1, 10, 100.0, -1.0, 0.0, 1, [10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0], hi!, -1, 10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj81), "[10.0, 0.0, 1, 10, 100.0, -1.0, 0.0, 1, [10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0], hi!, -1, 10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList0 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList1 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList0);
        java.lang.constant.ConstantDesc[] constantDescArray13 = new java.lang.constant.ConstantDesc[] { 10.0f, 0.0d, 1, 10, 100.0f, (-1.0d), 0.0d, 1, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]", "hi!", (-1) };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList14 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList14, constantDescArray13);
        java.lang.constant.ConstantDesc[] constantDescArray32 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList33 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList33, constantDescArray32);
        String str35 = constantDescList33.toString();
        java.lang.constant.ConstantDesc[] constantDescArray44 = new java.lang.constant.ConstantDesc[] { 100.0d, 1.0f, "hi!", 1.0f, 100, (-1), 0.0f };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList45 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList45, constantDescArray44);
        Object obj47 = constantDescList45.clone();
        Object[] objArray48 = new Object[] { 'a', constantDescList45 };
        Object[] objArray49 = constantDescList33.toArray(objArray48);
        int int50 = constantDescList33.size();
        boolean boolean51 = constantDescList14.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList33);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream52 = constantDescList33.parallelStream();
        boolean boolean53 = constantDescList33.isEmpty();
        java.lang.constant.ConstantDesc[] constantDescArray70 = new java.lang.constant.ConstantDesc[] { 10, 1, 10.0f, 10L, 0.0f, 0, 1, 0.0d, 0, 0L, 1, 10L, 0.0d, 0.0f, 10, 0L };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList71 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList71, constantDescArray70);
        String str73 = constantDescList71.toString();
        constantDescList71.add(0, (java.lang.constant.ConstantDesc) (-1.0f));
        boolean boolean78 = constantDescList71.add((java.lang.constant.ConstantDesc) 16);
        java.lang.constant.ConstantDesc constantDesc80 = constantDescList71.get(10);
        constantDescList71.clear();
        int int82 = constantDescList33.indexOf((Object) constantDescList71);
        constantDescList71.add(0, (java.lang.constant.ConstantDesc) 10.0d);
        boolean boolean86 = constantDescList1.remove((Object) constantDescList71);
        String str87 = constantDescList1.toString();
        org.junit.Assert.assertNotNull(constantDescArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(constantDescArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str35, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertNotNull(constantDescArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertEquals(obj47.toString(), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(String.valueOf(obj47), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj47), "[100.0, 1.0, hi!, 1.0, 100, -1, 0.0]");
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[a, [100.0, 1.0, hi!, 1.0, 100, -1, 0.0]]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 16 + "'", int50 == 16);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(constantDescStream52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(constantDescArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]" + "'", str73, "[10, 1, 10.0, 10, 0.0, 0, 1, 0.0, 0, 0, 1, 10, 0.0, 0.0, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertEquals("'" + constantDesc80 + "' != '" + 0L + "'", constantDesc80, 0L);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "[]" + "'", str87, "[]");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
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
        constantDescList31.clear();
        boolean boolean52 = constantDescList31.add((java.lang.constant.ConstantDesc) 10.0d);
        constantDescList31.ensureCapacity((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
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
        constantDescList31.clear();
        constantDescList31.ensureCapacity(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc55 = constantDescList31.set((int) (short) -1, (java.lang.constant.ConstantDesc) "[]");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
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
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
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
        boolean boolean57 = constantDescList31.add((java.lang.constant.ConstantDesc) 100.0f);
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList58 = new java.util.ArrayList<java.lang.constant.ConstantDesc>((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList31);
        constantDescList58.ensureCapacity((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }
}

