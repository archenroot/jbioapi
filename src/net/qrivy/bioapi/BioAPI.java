/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.24
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.qrivy.bioapi;

public class BioAPI implements BioAPIConstants {
  public static void setReference_h_layer_uuid_1_0_0(SWIGTYPE_p_unsigned_char value) {
    BioAPIJNI.set_reference_h_layer_uuid_1_0_0(SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public static SWIGTYPE_p_unsigned_char getReference_h_layer_uuid_1_0_0() {
    long cPtr = BioAPIJNI.get_reference_h_layer_uuid_1_0_0();
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public static long BioAPI_EnumModules(BioAPI_BSP_SCHEMA BspSchemaArray, long ArraySize, SWIGTYPE_p_unsigned_int ElementsNeeded, SWIGTYPE_p_unsigned_int NumElementsReturned) {
    return BioAPIJNI.BioAPI_EnumModules(BioAPI_BSP_SCHEMA.getCPtr(BspSchemaArray), ArraySize, SWIGTYPE_p_unsigned_int.getCPtr(ElementsNeeded), SWIGTYPE_p_unsigned_int.getCPtr(NumElementsReturned));
  }

  public static BioAPI_MEMORY_FUNCS getBioAPIMemoryFuncs() {
    long cPtr = BioAPIJNI.get_BioAPIMemoryFuncs();
    return (cPtr == 0) ? null : new BioAPI_MEMORY_FUNCS(cPtr, false);
  }

  public static long BioAPI_QueryDevice(long INPUT, BioAPI_SERVICE_UID OUTPUT) {
    return BioAPIJNI.BioAPI_QueryDevice(INPUT, BioAPI_SERVICE_UID.getCPtr(OUTPUT));
  }

  public static long BioAPI_FreeBIRHandle(long arg0, int arg1) {
    return BioAPIJNI.BioAPI_FreeBIRHandle(arg0, arg1);
  }

  public static long BioAPI_GetBIRFromHandle(long arg0, int arg1, SWIGTYPE_p_p_bioapi_hrs_bir OUTPUT) {
    return BioAPIJNI.BioAPI_GetBIRFromHandle(arg0, arg1, SWIGTYPE_p_p_bioapi_hrs_bir.getCPtr(OUTPUT));
  }

  public static long BioAPI_GetHeaderFromHandle(long arg0, int arg1, BioAPI_BIR_HEADER OUTPUT) {
    return BioAPIJNI.BioAPI_GetHeaderFromHandle(arg0, arg1, BioAPI_BIR_HEADER.getCPtr(OUTPUT));
  }

  public static long BioAPI_EnableEvents(long arg0, long arg1) {
    return BioAPIJNI.BioAPI_EnableEvents(arg0, arg1);
  }

  public static long BioAPI_Capture(long arg0, short arg1, int[] arg2, int arg3, int[] arg4) {
    return BioAPIJNI.BioAPI_Capture(arg0, arg1, arg2, arg3, arg4);
  }

  public static long BioAPI_CreateTemplate(long arg0, BioAPI_INPUT_BIR arg1, BioAPI_INPUT_BIR arg2, int[] OUTPUT, BioAPI_DATA arg4) {
    return BioAPIJNI.BioAPI_CreateTemplate(arg0, BioAPI_INPUT_BIR.getCPtr(arg1), BioAPI_INPUT_BIR.getCPtr(arg2), OUTPUT, BioAPI_DATA.getCPtr(arg4));
  }

  public static long BioAPI_Process(long arg0, BioAPI_INPUT_BIR arg1, int[] OUTPUT) {
    return BioAPIJNI.BioAPI_Process(arg0, BioAPI_INPUT_BIR.getCPtr(arg1), OUTPUT);
  }

  public static long BioAPI_VerifyMatch(long arg0, int arg1, int arg2, long arg3, BioAPI_INPUT_BIR arg4, BioAPI_INPUT_BIR arg5, int[] arg6, long[] arg7, int[] arg8, int[] arg9, SWIGTYPE_p_p_bioapi_data arg10) {
    return BioAPIJNI.BioAPI_VerifyMatch(arg0, arg1, arg2, arg3, BioAPI_INPUT_BIR.getCPtr(arg4), BioAPI_INPUT_BIR.getCPtr(arg5), arg6, arg7, arg8, arg9, SWIGTYPE_p_p_bioapi_data.getCPtr(arg10));
  }

  public static long BioAPI_IdentifyMatch(long arg0, int arg1, int arg2, long arg3, BioAPI_INPUT_BIR arg4, BioAPI_IDENTIFY_POPULATION arg5, long arg6, long arg7, long[] arg8, SWIGTYPE_p_p_p_bioapi_candidate arg9, int arg10) {
    return BioAPIJNI.BioAPI_IdentifyMatch(arg0, arg1, arg2, arg3, BioAPI_INPUT_BIR.getCPtr(arg4), BioAPI_IDENTIFY_POPULATION.getCPtr(arg5), arg6, arg7, arg8, SWIGTYPE_p_p_p_bioapi_candidate.getCPtr(arg9), arg10);
  }

  public static long BioAPI_Identify(long arg0, int arg1, int arg2, long arg3, BioAPI_IDENTIFY_POPULATION arg4, long arg5, long arg6, long[] arg7, SWIGTYPE_p_p_p_bioapi_candidate arg8, int arg9, int[] arg10) {
    return BioAPIJNI.BioAPI_Identify(arg0, arg1, arg2, arg3, BioAPI_IDENTIFY_POPULATION.getCPtr(arg4), arg5, arg6, arg7, SWIGTYPE_p_p_p_bioapi_candidate.getCPtr(arg8), arg9, arg10);
  }

  public static long BioAPI_Import(long arg0, BioAPI_DATA arg1, BioAPI_BIR_BIOMETRIC_DATA_FORMAT arg2, short arg3, int[] OUTPUT) {
    return BioAPIJNI.BioAPI_Import(arg0, BioAPI_DATA.getCPtr(arg1), BioAPI_BIR_BIOMETRIC_DATA_FORMAT.getCPtr(arg2), arg3, OUTPUT);
  }

  public static long BioAPI_SetPowerMode(long arg0, long arg1) {
    return BioAPIJNI.BioAPI_SetPowerMode(arg0, arg1);
  }

  public static long BioAPI_DbOpen(long arg0, short arg1, long arg2, int[] arg3, long[] arg4) {
    return BioAPIJNI.BioAPI_DbOpen(arg0, arg1, arg2, arg3, arg4);
  }

  public static long BioAPI_DbClose(long arg0, int arg1) {
    return BioAPIJNI.BioAPI_DbClose(arg0, arg1);
  }

  public static long BioAPI_DbCreate(long arg0, short arg1, long arg2, int[] OUTPUT) {
    return BioAPIJNI.BioAPI_DbCreate(arg0, arg1, arg2, OUTPUT);
  }

  public static long BioAPI_DbDelete(long arg0, short arg1) {
    return BioAPIJNI.BioAPI_DbDelete(arg0, arg1);
  }

  public static long BioAPI_DbSetCursor(long arg0, int arg1, SWIGTYPE_p_a_16__unsigned_char arg2, long[] OUTPUT) {
    return BioAPIJNI.BioAPI_DbSetCursor(arg0, arg1, SWIGTYPE_p_a_16__unsigned_char.getCPtr(arg2), OUTPUT);
  }

  public static long BioAPI_DbFreeCursor(long arg0, long arg1) {
    return BioAPIJNI.BioAPI_DbFreeCursor(arg0, arg1);
  }

  public static long BioAPI_DbStoreBIR(long arg0, BioAPI_INPUT_BIR arg1, int arg2, SWIGTYPE_p_a_16__unsigned_char OUTPUT) {
    return BioAPIJNI.BioAPI_DbStoreBIR(arg0, BioAPI_INPUT_BIR.getCPtr(arg1), arg2, SWIGTYPE_p_a_16__unsigned_char.getCPtr(OUTPUT));
  }

  public static long BioAPI_DbGetBIR(long arg0, int arg1, SWIGTYPE_p_a_16__unsigned_char arg2, int[] arg3, long[] arg4) {
    return BioAPIJNI.BioAPI_DbGetBIR(arg0, arg1, SWIGTYPE_p_a_16__unsigned_char.getCPtr(arg2), arg3, arg4);
  }

  public static long BioAPI_DbGetNextBIR(long INPUT, long[] INOUT, int[] arg2, SWIGTYPE_p_a_16__unsigned_char arg3) {
    return BioAPIJNI.BioAPI_DbGetNextBIR(INPUT, INOUT, arg2, SWIGTYPE_p_a_16__unsigned_char.getCPtr(arg3));
  }

  public static long BioAPI_DbQueryBIR(long arg0, int arg1, BioAPI_INPUT_BIR arg2, SWIGTYPE_p_a_16__unsigned_char OUTPUT) {
    return BioAPIJNI.BioAPI_DbQueryBIR(arg0, arg1, BioAPI_INPUT_BIR.getCPtr(arg2), SWIGTYPE_p_a_16__unsigned_char.getCPtr(OUTPUT));
  }

  public static long BioAPI_DbDeleteBIR(long arg0, int arg1, SWIGTYPE_p_a_16__unsigned_char arg2) {
    return BioAPIJNI.BioAPI_DbDeleteBIR(arg0, arg1, SWIGTYPE_p_a_16__unsigned_char.getCPtr(arg2));
  }

  public static BioAPI_BIR getBirFromHandle(long moduleHandle, int handle) throws net.qrivy.jbioapi.BioApiException {
    long cPtr = BioAPIJNI.getBirFromHandle(moduleHandle, handle);
    return (cPtr == 0) ? null : new BioAPI_BIR(cPtr, false);
  }

  public static SWIGTYPE_p_a_16__unsigned_char getStructuredUuid(String INPUT) throws net.qrivy.jbioapi.BioApiException {
    long cPtr = BioAPIJNI.getStructuredUuid(INPUT);
    return (cPtr == 0) ? null : new SWIGTYPE_p_a_16__unsigned_char(cPtr, false);
  }

  public static String getPrintableUUID(SWIGTYPE_p_a_16__unsigned_char INPUT) {
    return BioAPIJNI.getPrintableUUID(SWIGTYPE_p_a_16__unsigned_char.getCPtr(INPUT));
  }

  public static long attachModule(SWIGTYPE_p_a_16__unsigned_char uuid, BioAPI_MEMORY_FUNCS memoryFuncs, long DeviceID) throws net.qrivy.jbioapi.BioApiException {
    return BioAPIJNI.attachModule(SWIGTYPE_p_a_16__unsigned_char.getCPtr(uuid), BioAPI_MEMORY_FUNCS.getCPtr(memoryFuncs), DeviceID);
  }

  public static void detachModule(long bspHandle) throws net.qrivy.jbioapi.BioApiException {
    BioAPIJNI.detachModule(bspHandle);
  }

  public static long getNumberOfModules() {
    return BioAPIJNI.getNumberOfModules();
  }

  public static BioAPI_BSP_SCHEMA getSchemas() {
    long cPtr = BioAPIJNI.getSchemas();
    return (cPtr == 0) ? null : new BioAPI_BSP_SCHEMA(cPtr, false);
  }

  public static void loadModule(SWIGTYPE_p_a_16__unsigned_char uuid) throws net.qrivy.jbioapi.BioApiException {
    BioAPIJNI.loadModule(SWIGTYPE_p_a_16__unsigned_char.getCPtr(uuid));
  }

  public static void unloadModule(SWIGTYPE_p_a_16__unsigned_char uuid) throws net.qrivy.jbioapi.BioApiException {
    BioAPIJNI.unloadModule(SWIGTYPE_p_a_16__unsigned_char.getCPtr(uuid));
  }

  public static void loadModuleWithCallbacks(SWIGTYPE_p_a_16__unsigned_char uuid, SWIGTYPE_p_f_p_q_const__a_16__unsigned_char_p_void_unsigned_int_unsigned_int_unsigned_int__unsigned_int appNotifyCallback, SWIGTYPE_p_void appNotifyCallbackContext) throws net.qrivy.jbioapi.BioApiException {
    BioAPIJNI.loadModuleWithCallbacks(SWIGTYPE_p_a_16__unsigned_char.getCPtr(uuid), SWIGTYPE_p_f_p_q_const__a_16__unsigned_char_p_void_unsigned_int_unsigned_int_unsigned_int__unsigned_int.getCPtr(appNotifyCallback), SWIGTYPE_p_void.getCPtr(appNotifyCallbackContext));
  }

  public static void unloadModuleWithCallbacks(SWIGTYPE_p_a_16__unsigned_char uuid, SWIGTYPE_p_f_p_q_const__a_16__unsigned_char_p_void_unsigned_int_unsigned_int_unsigned_int__unsigned_int appNotifyCallback, SWIGTYPE_p_void appNotifyCallbackContext) throws net.qrivy.jbioapi.BioApiException {
    BioAPIJNI.unloadModuleWithCallbacks(SWIGTYPE_p_a_16__unsigned_char.getCPtr(uuid), SWIGTYPE_p_f_p_q_const__a_16__unsigned_char_p_void_unsigned_int_unsigned_int_unsigned_int__unsigned_int.getCPtr(appNotifyCallback), SWIGTYPE_p_void.getCPtr(appNotifyCallbackContext));
  }

  public static void init() throws net.qrivy.jbioapi.BioApiException {
    BioAPIJNI.init();
  }

  public static int enroll(long moduleHandle, short purpose, int timeout) throws net.qrivy.jbioapi.BioApiException {
    return BioAPIJNI.enroll(moduleHandle, purpose, timeout);
  }

  public static int enrollWithPayload(long moduleHandle, short purpose, BioAPI_DATA payload, int timeout) {
    return BioAPIJNI.enrollWithPayload(moduleHandle, purpose, BioAPI_DATA.getCPtr(payload), timeout);
  }

  public static int enrollAndAdapt(long moduleHandle, short purpose, BioAPI_INPUT_BIR storedTemplate, int timeout) {
    return BioAPIJNI.enrollAndAdapt(moduleHandle, purpose, BioAPI_INPUT_BIR.getCPtr(storedTemplate), timeout);
  }

  public static int enrollAndAdaptWithPayload(long moduleHandle, short purpose, BioAPI_INPUT_BIR storedTemplate, BioAPI_DATA payload, int timeout) {
    return BioAPIJNI.enrollAndAdaptWithPayload(moduleHandle, purpose, BioAPI_INPUT_BIR.getCPtr(storedTemplate), BioAPI_DATA.getCPtr(payload), timeout);
  }

  public static void terminate() throws net.qrivy.jbioapi.BioApiException {
    BioAPIJNI.terminate();
  }

  public static BioAPI_INPUT_BIR getInputBIR(BioAPI_BIR bir) {
    return new BioAPI_INPUT_BIR(BioAPIJNI.getInputBIR(BioAPI_BIR.getCPtr(bir)), true);
  }

  public static verifyResult verify(long moduleHandle, int far, int frr, long farOrFrr, BioAPI_INPUT_BIR inputBir, int timeout) throws net.qrivy.jbioapi.BioApiException {
    return new verifyResult(BioAPIJNI.verify(moduleHandle, far, frr, farOrFrr, BioAPI_INPUT_BIR.getCPtr(inputBir), timeout), true);
  }

  public static verifyResult verifyBir(long moduleHandle, int far, int frr, long farOrFrr, BioAPI_BIR bir, int timeout) {
    return new verifyResult(BioAPIJNI.verifyBir(moduleHandle, far, frr, farOrFrr, BioAPI_BIR.getCPtr(bir), timeout), true);
  }


  public static java.nio.ByteBuffer getBirHeaderByteBuffer(BioAPI_BIR bir) {
    return getBirHeaderByteBuffer(BioAPI_BIR.getCPtr(bir));
    }
    
  static native java.nio.ByteBuffer getBirHeaderByteBuffer(long cpointer);
  
  public static java.nio.ByteBuffer getBirDataByteBuffer(BioAPI_BIR bir) {
    return getBirDataByteBuffer(BioAPI_BIR.getCPtr(bir));
    }
  
  static native java.nio.ByteBuffer getBirDataByteBuffer(long cpointer);
	
  public static java.nio.ByteBuffer getBirSignatureByteBuffer(BioAPI_BIR bir) {
    return getBirSignatureByteBuffer(BioAPI_BIR.getCPtr(bir));
    }
  
  static native java.nio.ByteBuffer getBirSignatureByteBuffer(long cpointer);

  public static void setBirHeader(BioAPI_BIR bir, java.nio.ByteBuffer headerBuffer) {
    setBirHeader(BioAPI_BIR.getCPtr(bir), headerBuffer);
    }

  static native void setBirHeader(long cpointer, java.nio.ByteBuffer headerBuffer);

  public static void setBirData(BioAPI_BIR bir, java.nio.ByteBuffer dataBuffer) {
    setBirData(BioAPI_BIR.getCPtr(bir), dataBuffer);
    }

  static native void setBirData(long cpointer, java.nio.ByteBuffer dataBuffer);

  public static void setSignatureData(BioAPI_BIR bir, java.nio.ByteBuffer signatureBuffer) {
    setSignatureData(BioAPI_BIR.getCPtr(bir), signatureBuffer);
    }

  static native void setSignatureData(long cpointer, java.nio.ByteBuffer signatureBuffer);

}
