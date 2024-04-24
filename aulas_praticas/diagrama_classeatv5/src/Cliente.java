// Classe Loja
public class Loja {
  private String id;
  private String nome;
  private String nomeFant;
  private String endereco;
  private String telefone;

  // Construtor
  public Loja(String id, String nome, String nomeFant, String endereco, String telefone){
    this.id = id;
    this.nome = nome;
    this.nomeFant = nomeFant;
    this.endereco = endereco;
    this.telefone = telefone;
  }

  // getters e setters 
  public String getId(){
    return id;
  }

  public void setId(String id){
    this.id = id;
  }

  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getNomeFant(){
    return nomeFant;
  }

  public void setNomeFant(String nomeFant){
    this.nomeFant;
  }

  public String getEndereco(){
    return endereco;
  }

  public void setEndereco(String endereco){
    this.endereco;
  }

  public String getTelefone(){
    return telefone;
  }

  public void setTelefone(String telefone){
    this.telefone
  }   
}

// Classe Cliente 
public class Cliente {
  private String nome;
  private String cpf;
  private String telefone;
  private String email;
  private Produto[] produtos;

  public Cliente (String nome, String cpf, String telefone, String email){
    this.nome = nome;
    this.cpf = cpf;
    this.telefone = telefone;
    this.email = email;
    this.produtos = new Produto[0];
  }

  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getCpf(){
    return cpf;
  }

  public void setCpf(String cpf){
    this.cpf = cpf;
  }

  public String getTelefone(){
    return telefone;
  }

  public void setTelefone(String telefone){
    this.telefone = telefone;
  }

  public String getEmail(){
    return email;
  }

  public void setEmail(String email){
    this.email = email;
  }

  // metodos
  public Produto[] getProdutos(){
    return produtos;
  }

  public void setProdutos(Produto[] produtos){
    // logica pra escolher produtos
    return produtos;
  }

  public void removerProd(){
    // logica pra remover produtos
  }
}

// Classe Produto

public class Produto {
  private String nome;
  private String id;
  private int quantidade;
  private double preco;
  
  public Produto (String nome, String id, int quantidade, double preco){
    this.nome = nome;
    this.id = id;
    this.quantidade = quantidade;
    this.preco = preco;
  }

  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getId(){
    return id;
  }

  public void setId(String id){
    this.id = id;
  }

  public int getQuantidade(){
    return quantidade;
  }

  public void setQuantidade(int quantidade){
    this.quantidade = quantidade;
  }

  public double getPreco(){
    return preco;
  }

  public void setQuantidade (){
    this.quantidade = quantidade;
  }

  public void atualizarPreco(){

  }

  public void atualizarQuant(){

  }
}

public class Funcionario {
  private String nome;
  private String id;
  private String cpf;
  private String email;
  private String endereco;
  private String cargo;

  public Funcionario (String nome, String id, String cpf, String email, String endereco, String cargo){
    this.nome = nome;
    this.id = id;
    this.cpf = cpf;
    this.email = email;
    this.endereco = endereco;
    this.cargo = cargo;
  }

  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome;
  }

  public String getId(){
    return id;
  }

  public void setId(String id){
    this.id = id;
  }

  public String getCpf(){
    return cpf;
  }

  public void setCpf(String cpf){
    this.cpf = cpf;
  }

  public String getEmail(){
    return email;
  }

  public void setEmail(String email){
    this.email = email;
  }

  public String getEndereco(){
    return endereco;
  }

  public void setEndereco(String endereco){
    this.endereco = endereco;
  }

  public String getCargo(){
    return cargo;
  }

  public void setCargo(String cargo){
    this.cargo = cargo;
  }

  public Produto atualizarProd(){
    return null;
  }
}

// Classe Pedido
public class Pedido{
  private String id;
  private Cliente cliente;
  private Date data;
  private String status;

  public Pedido (String id, Cliente cliente, Date data, String status){
    this.id = id;
    this.cliente = cliente;
    this.data = data;
    this.status = status;
  }

  public String getId(){
    return id;
  }

  public void setId(String id){
    this.id = id;
  }

  public Cliente getCliente(){
    return cliente;
  }

  public void setCliente(Cliente cliente){
    this.cliente = cliente;
  }

  public Date getData(){
    return data;
  }

  public void setData (Date data){
    this.data = data;
  }

  public String getStatus(){
    return status;
  }

  public void setStatus(String status){
    this.status = status;
  }

  public void adicionarProd(){

  }

  public void removerProd(){
    
  }
}
