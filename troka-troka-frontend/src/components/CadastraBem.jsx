import React, { useState, useEffect } from "react";
import { Box, TextField, Button, Typography } from "@mui/material";
import axios from "axios";

const AddGoodForm = ({ userCpf }) => {
  const [goodData, setGoodData] = useState({
    name: "",
    description: "",
    category: "",
    value: "",
    photo: "",
    address: "",
  });
  const [addresses, setAddresses] = useState([]);

  useEffect(() => {
    // Carregar os endereços do usuário
    axios
      .get(`http://localhost:8080/user/${userCpf}/addresses`)
      .then((response) => setAddresses(response.data))
      .catch((error) => console.error("Erro ao carregar endereços", error));
  }, [userCpf]);

  const handleChange = (e) => {
    const { name, value } = e.target;
    setGoodData({ ...goodData, [name]: value });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
      const response = await axios.post("http://localhost:8080/good", goodData);
      console.log("Item cadastrado com sucesso!", response.data);
    } catch (error) {
      console.error("Erro ao cadastrar item:", error);
    }
  };

  return (
    <Box
      component="form"
      onSubmit={handleSubmit}
      sx={{ display: "flex", flexDirection: "column", gap: 2 }}
    >
      <Typography variant="h5">Adicionar Item</Typography>
      <TextField
        label="Nome do Item"
        name="name"
        value={goodData.name}
        onChange={handleChange}
        required
      />
      <TextField
        label="Descrição do Item"
        name="description"
        value={goodData.description}
        onChange={handleChange}
        required
      />
      <TextField
        label="Categoria"
        name="category"
        value={goodData.category}
        onChange={handleChange}
        required
      />
      <TextField
        label="Valor Estimado"
        name="value"
        type="number"
        value={goodData.value}
        onChange={handleChange}
        required
      />
      <TextField
        label="Foto (URL)"
        name="photo"
        value={goodData.photo}
        onChange={handleChange}
        required
        placeholder="Insira a URL da foto"
      />
      <TextField
        select={false} // Usar InputBox simples
        label="Local de Troca"
        name="address"
        value={goodData.address}
        onChange={handleChange}
        required
        placeholder="Insira o endereço ou selecione"
      />
      <Typography variant="body2" color="textSecondary">
        Endereços disponíveis: {addresses.join(", ")}
      </Typography>
      <Button variant="contained" color="primary" type="submit">
        Adicionar Item
      </Button>
    </Box>
  );
};

export default AddGoodForm;
