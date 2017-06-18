all:
	g++ -o libBridgeServiceImpl.so -shared -fPIC -I $(JAVA_HOME)/include -I $(JAVA_HOME)/include/linux src/main/cpp/BridgeServiceImpl.cpp &&\
	mv libBridgeServiceImpl.so build/cpp/libBridgeServiceImpl.so
clean:
	rm build/cpp/libBridgeServiceImpl.so