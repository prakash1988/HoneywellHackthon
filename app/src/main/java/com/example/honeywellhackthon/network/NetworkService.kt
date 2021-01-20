package com.example.honeywellhackthon.network

import com.example.honeywellhackthon.simulator.WebSocket
import com.mindorks.ridesharing.simulator.WebSocketListener

class NetworkService {

    fun createWebSocket(webSocketListener: WebSocketListener): WebSocket {
        return WebSocket(webSocketListener)
    }

}