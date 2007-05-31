/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class net_qrivy_bioapi_BioAPI */

#ifndef _Included_net_qrivy_bioapi_BioAPI
#define _Included_net_qrivy_bioapi_BioAPI
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     net_qrivy_bioapi_BioAPI
 * Method:    getBirHeaderByteBuffer
 * Signature: (J)Ljava/nio/ByteBuffer;
 */
JNIEXPORT jobject JNICALL Java_net_qrivy_bioapi_BioAPI_getBirHeaderByteBuffer
  (JNIEnv *, jclass, jlong);

/*
 * Class:     net_qrivy_bioapi_BioAPI
 * Method:    getBirDataByteBuffer
 * Signature: (J)Ljava/nio/ByteBuffer;
 */
JNIEXPORT jobject JNICALL Java_net_qrivy_bioapi_BioAPI_getBirDataByteBuffer
  (JNIEnv *, jclass, jlong);

/*
 * Class:     net_qrivy_bioapi_BioAPI
 * Method:    getBirSignatureByteBuffer
 * Signature: (J)Ljava/nio/ByteBuffer;
 */
JNIEXPORT jobject JNICALL Java_net_qrivy_bioapi_BioAPI_getBirSignatureByteBuffer
  (JNIEnv *, jclass, jlong);

/*
 * Class:     net_qrivy_bioapi_BioAPI
 * Method:    setBirHeader
 * Signature: (JLjava/nio/ByteBuffer;)V
 */
JNIEXPORT void JNICALL Java_net_qrivy_bioapi_BioAPI_setBirHeader
  (JNIEnv *, jclass, jlong, jobject);

/*
 * Class:     net_qrivy_bioapi_BioAPI
 * Method:    setBirData
 * Signature: (JLjava/nio/ByteBuffer;)V
 */
JNIEXPORT void JNICALL Java_net_qrivy_bioapi_BioAPI_setBirData
  (JNIEnv *, jclass, jlong, jobject);

/*
 * Class:     net_qrivy_bioapi_BioAPI
 * Method:    setSignatureData
 * Signature: (JLjava/nio/ByteBuffer;)V
 */
JNIEXPORT void JNICALL Java_net_qrivy_bioapi_BioAPI_setSignatureData
  (JNIEnv *, jclass, jlong, jobject);

#ifdef __cplusplus
}
#endif
#endif
