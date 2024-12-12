import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Login from "./components/Login";
import Register from "./components/Register";
import UserList from "./components/UserList";
import AddGood from "./components/AddGood"; // Tela para cadastro de Good

const App = () => {
  return (
    <Router>
      <Routes>
        {/* Rotas de autenticação */}
        <Route path="/login" element={<Login />} />
        <Route path="/register" element={<Register />} />

        {/* Rotas principais */}
        <Route path="/" element={<UserList />} />
        <Route path="/add-good" element={<AddGood />} /> {/* Nova rota para cadastro de itens */}
      </Routes>
    </Router>
  );
};

export default App;