/*
 * Copyright 2012 Sebastien Dionne
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.atmosphere.protocol.socketio;

import org.atmosphere.websocket.WebSocket;

/**
 * 
 * @author Sebastien Dionne  : sebastien.dionne@gmail.com
 *
 */
public interface SocketIOWebSocketSessionWrapper extends SocketIOSessionOutbound {
	
	SocketIOSession getSession();
	
	void onDisconnect();
	
	void onMessage(byte frame, String message);
	
	void onMessage(byte frame, byte[] data, int offset, int length);
	
	boolean isInitiated();
	
	WebSocket webSocket();
	 
	void setWebSocket(WebSocket websocket);

	void initiated(boolean initialed);
}
