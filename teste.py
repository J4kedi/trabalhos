import smtplib # importa biblioteca para trabalhar com o SMTP
from email.mime.multipart import MIMEMultipart # importando bilioteca para trabalhar com formato MIME
from email.mime.text import MIMEText # importanto biblioteca para trabalhar com o email no formato texto

### Defição das varíáveis para servidor de email ###
server = 'smtp.gmail.com' # servidor SMTP
port = 587 # porta para usar STARTTLS
username = "valdemapuc@gmail.com" # username
password = 'tpwmewvjsgtddfcc' # senha - obter a senha do APP

### definição do email ###
mail_from = "valdemapuc@gmail.com" # remetente
mail_to = "kauanpardini@gmail.com" # destinatário
mail_subject = "Experiência Criativa" # assunto mensagem
mail_body = "Olá Mundo, Python é Legal!!" # Corpo da mensagem

### criando o email ###
mensagem = MIMEMultipart() # cria um para trabalhar com email no formato MIME
mensagem['From'] = mail_from # adicionando o remetente
mensagem['To'] = mail_to # adicionando o destinatário
mensagem['Subject'] = mail_subject # adicionando o assunto do email
mensagem.attach(MIMEText(mail_body, 'plain')) # anexando o email no formato texto simples (plain)

### Conexão com o servidor de email ###
connection = smtplib.SMTP(server, port) # abrindo uma conexão como o servidor
connection.starttls() # definir o protocolos de criptografia STARTTLS
connection.login(username,password) # autenticando no servidor
connection.send_message(mensagem)  # enviando mensagem
connection.quit() # Encerrando a conexão