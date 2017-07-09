// IHelloWorld.aidl.aidl
package android.os;

// Declare any non-default types here with import statements

interface IHelloWorld {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
     void printSth(String content);
     String getHelloWorld();

}
