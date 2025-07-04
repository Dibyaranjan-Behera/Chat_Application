# 💬 WhatsApp-Style Real-Time Chat UI

A modern and responsive real-time chat UI inspired by WhatsApp Web, built using **HTML, CSS, Bootstrap 5**, and **JavaScript**. This UI connects to a Spring Boot backend via **WebSockets (STOMP + SockJS)** to send and receive messages in real-time.

## 🖼️ UI Overview

![Chat UI Screenshot](screenshot.png) <!-- Replace with an actual image if available -->

### Features

- 📱 **WhatsApp-inspired Layout**  
  Chat bubbles, typing indicator, sender names, and timestamps styled to mimic WhatsApp.

- 🚀 **Real-time Messaging**  
  Messages appear instantly via optimistic UI and sync across users using STOMP over WebSocket.

- ✍️ **Typing Indicator**  
  Shows when another user is typing via dynamic updates from `/topic/typing`.

- 🌐 **Responsive Design**  
  Layout adapts across devices using Bootstrap 5.

- 🎨 **Custom Styling**  
  - Background with WhatsApp-like tile image  
  - Sent (green) and received (white) chat bubbles  
  - User-specific styling for names and timestamps

## 📂 File Structure

