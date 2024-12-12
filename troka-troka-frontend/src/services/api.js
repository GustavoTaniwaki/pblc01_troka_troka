import axios from "axios";

// URL base para o backend
const api = axios.create({
  baseURL: "http://localhost:8080",
});

// Funções para operações CRUD de usuários
export const fetchUsers = async () => {
  const response = await api.get("/user/all");
  return response.data;
};

export const fetchUserByCpf = async (cpf) => {
  const response = await api.get(`/user/${cpf}`);
  return response.data;
};

export const createUser = async (userData) => {
  const response = await api.post("/user", userData);
  return response.data;
};

export const updateUser = async (cpf, userData) => {
  const response = await api.put(`/user/${cpf}`, userData);
  return response.data;
};

export const deleteUser = async (cpf) => {
  await api.delete(`/user/${cpf}`);
};

// Funções de autenticação
export const login = async (cpf, password) => {
  const response = await api.post("/auth/login", { cpf, password });
  return response.data;
};

export const registerUser = async (userData) => {
  const response = await api.post("/auth/register", userData);
  return response.data;
};

// Funções para manipular Good (Itens)
export const fetchGoods = async () => {
  const response = await api.get("/good/all");
  return response.data;
};

export const fetchGoodById = async (id) => {
  const response = await api.get(`/good/${id}`);
  return response.data;
};

export const createGood = async (goodData) => {
  const response = await api.post("/good", goodData);
  return response.data;
};

export const updateGood = async (id, goodData) => {
  const response = await api.put(`/good/${id}`, goodData);
  return response.data;
};

export const deleteGood = async (id) => {
  await api.delete(`/good/${id}`);
};

// Função para buscar os endereços do usuário
export const fetchUserAddresses = async (cpf) => {
  const response = await api.get(`/user/${cpf}/addresses`);
  return response.data;
};

export default api;
