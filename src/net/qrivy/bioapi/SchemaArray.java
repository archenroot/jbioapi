/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.24
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.qrivy.bioapi;

public class SchemaArray {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SchemaArray(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SchemaArray obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected SchemaArray() {
    this(0, false);
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      BioAPIJNI.delete_SchemaArray(swigCPtr);
    }
    swigCPtr = 0;
  }

  public SchemaArray(int nelements) {
    this(BioAPIJNI.new_SchemaArray(nelements), true);
  }

  public BioAPI_BSP_SCHEMA getitem(int index) {
    return new BioAPI_BSP_SCHEMA(BioAPIJNI.SchemaArray_getitem(swigCPtr, index), true);
  }

  public void setitem(int index, BioAPI_BSP_SCHEMA value) {
    BioAPIJNI.SchemaArray_setitem(swigCPtr, index, BioAPI_BSP_SCHEMA.getCPtr(value));
  }

  public BioAPI_BSP_SCHEMA cast() {
    long cPtr = BioAPIJNI.SchemaArray_cast(swigCPtr);
    return (cPtr == 0) ? null : new BioAPI_BSP_SCHEMA(cPtr, false);
  }

  public static SchemaArray frompointer(BioAPI_BSP_SCHEMA t) {
    long cPtr = BioAPIJNI.SchemaArray_frompointer(BioAPI_BSP_SCHEMA.getCPtr(t));
    return (cPtr == 0) ? null : new SchemaArray(cPtr, false);
  }

}
