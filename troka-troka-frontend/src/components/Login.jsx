import React, { useState } from "react";
import { login } from "../services/api";

const Login = ({ onLoginSuccess }) => {
  const [cpf, setCpf] = useState("");
  const [password, setPassword] = useState("");
  const [error, setError] = useState("");

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      const data = await login(cpf, password);
      onLoginSuccess(data); // Enviar os dados do usuário autenticado
    } catch (err) {
      setError("CPF ou senha inválidos.");
    }
  };

  return (
    <div>
      <h1>Login</h1>
      <form onSubmit={handleSubmit}>
        <div>
          <label>CPF:</label>
          <input
            type="text"
            value={cpf}
            onChange={(e) => setCpf(e.target.value)}
            required
          />
        </div>
        <div>
          <label>Senha:</label>
          <input
            type="password"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
            required
          />
        </div>
        {error && <p style={{ color: "red" }}>{error}</p>}
        <button type="submit">Entrar</button>
      </form>
      <p>
        Não tem uma conta? <a href="/register">Registrar-se</a>
      </p>
    </div>
  );
};

export default Login;
