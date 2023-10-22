const form = document.getElementById("survey-form");
const submitButton = document.getElementById("submit-button");
const resetButton = document.getElementById("reset-button");

submitButton.addEventListener("click", (event) => {
  event.preventDefault();

  const formData = new FormData(form);
  const values = {};

  for (const [key, value] of formData.entries()) {
    values[key] = value;
  }

  if (validateForm(values)) {
    showPopup(values);
  }
});

resetButton.addEventListener("click", (event) => {
  form.reset();
});

function validateForm(values) {
  let isValid = true;

  for (const key in values) {
    if (values[key] === "") {
      isValid = false;
      break;
    }
  }

  return isValid;
}

function showPopup(values) {
  const popup = document.createElement("div");
  popup.classList.add("popup");

  const popupContent = document.createElement("div");
  popupContent.classList.add("popup-content");

  for (const key in values) {
    const label = document.createElement("label");
    label.textContent = key + ": ";

    const value = document.createElement("span");
    value.textContent = values[key];

    popupContent.appendChild(label);
    popupContent.appendChild(value);
    popupContent.appendChild(document.createElement("br"));
  }

  const closeButton = document.createElement("button");
  closeButton.textContent = "Close";
  closeButton.addEventListener("click", () => {
    popup.remove();
    form.reset();
  });

  popupContent.appendChild(closeButton);
  popup.appendChild(popupContent);

  document.body.appendChild(popup);
}