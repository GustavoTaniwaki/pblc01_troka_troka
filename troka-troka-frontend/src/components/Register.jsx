import React, { useState } from "react";
import { registerUser } from "../services/api";

const Register = () => {
  const [formData, setFormData] = useState({
    cpf: "",
    password: "",
    name: "",
    birthDate: "",
    phone: "",
    email: "",
    address: "",
  });
  const [success, setSuccess] = useState(false);
  const [error, setError] = useState("");

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData({ ...formData, [name]: value });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      await registerUser({
        ...formData,
        birthDate: new Date(formData.birthDate).toISOString(),
      });
      setSuccess(true);
    } catch (err) {
      setError("Erro ao registrar. Verifique os dados.");
    }
  };

  return (
    <div>
      <h1>Registrar-se</h1>
      {success ? (
        <p>Usuário registrado com sucesso! <a href="/login">Faça login</a>.</p>
      ) : (
        <form onSubmit={handleSubmit}>
          <div>
            <label>CPF:</label>
            <input
              type="text"
              name="cpf"
              value={formData.cpf}
              onChange={handleChange}
              required
            />
          </div>
          <div>
            <label>Senha:</label>
            <input
              type="password"
              name="password"
              value={formData.password}
              onChange={handleChange}
              required
            />
          </div>
          <div>
            <label>Nome:</label>
            <input
              type="text"
              name="name"
              value={formData.name}
              onChange={handleChange}
              required
            />
          </div>
          <div>
            <label>Data de Nascimento:</label>
            <input
              type="date"
              name="birthDate"
              value={formData.birthDate}
              onChange={handleChange}
              required
            />
          </div>
          <div>
            <label>Telefone:</label>
            <input
              type="text"
              name="phone"
              value={formData.phone}
              onChange={handleChange}
            />
          </div>
          <div>
            <label>Email:</label>
            <input
              type="email"
              name="email"
              value={formData.email}
              onChange={handleChange}
              required
            />
          </div>
          <div>
            <label>Endereço:</label>
            <input
              type="text"
              name="address"
              value={formData.address}
              onChange={handleChange}
              required
            />
          </div>
          {error && <p style={{ color: "red" }}>{error}</p>}
          <button type="submit">Registrar</button>
        </form>
      )}
    </div>
  );
};

export default Register;
