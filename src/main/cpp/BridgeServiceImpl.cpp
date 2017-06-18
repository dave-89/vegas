#include<jni.h>
#include <cstring>

#include"org_davide_vegas_controller_BridgeServiceImpl.h"


JNIEXPORT jstring JNICALL Java_org_davide_vegas_controller_BridgeServiceImpl_helloFromC
  (JNIEnv * env, jobject obj) {
	char * buff = (char*) "Hello from C++";
	return env -> NewStringUTF(buff);
}
